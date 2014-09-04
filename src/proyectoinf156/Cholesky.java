package proyectoinf156;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Cholesky
{

    protected int n;

    protected float l[] = null;
    public static String salida="";
   
    public Cholesky (float S[], int n) throws NonDefiniteException
    {
	init (this.n = n);
	l = new float [n * (n + 1) / 2];
	if (convert (S, (S == null) ? 0:S.length, l, n) != 0)
	    throw new IllegalArgumentException ("S does not correspond " + "to a symmetric matrix");
	switch (calc (l, l_, n))
	{
	    case - 2:
		throw new IllegalArgumentException ("S does not correspond " + "to a positive matrix");
	    case - 1:
		throw new NonDefiniteException ();
	}
    }


    /** Get a vector such that S x = y. */
    public float[] getX (float y[])
    {
	float x[] = (float[]) y.clone ();
	solve (l, x, l_, n);
	return x;
    }


    /** Return the Cholesky lower triangular matrix L.
     * @return A <a href=#lmatrix>n(n+1)/2</a> array containing L.
     */
    public float[] getL ()
    {
	return l;
    }


    /** <hr> */

    /** RunTime exception thrown if the matrix is not definite. */

    public static class NonDefiniteException extends ArithmeticException
    {
	/*!*/public NonDefiniteException ()
	{
	    super ();
	}
	/*!*/public NonDefiniteException (String s)
	{
	    super (s);
	}
    }


    /**************************************************/
    /***  Native implementation of the algorithm    ***/
    /**************************************************/

    // Index mechanism in lower triangular matrix so that :
    //   M[i,j] = M[i+l_[j]] for j < nl_

    static int l_[] = null, nl_ = 0;

    // Initialize the index buffer for lower triangular matrix up to n x n.

    static final void init (int n)
    {
	if (nl_ < n)
	{
	    nl_ = n;
	    l_ = new int [n];
	    for (int k = 0 ; k < n ; k++)
		l_ [k] = (k * (k + 1)) / 2;
	}
    }


    // Convert a symmetric matrix Q given in various forms
    // to a lower triangular matrix q

    static /*nativez*/int convert (float Q[], int dimQ, float q[], int n)
    {
	if (dimQ == 0)
	{
	    for (int ij = 0 ; ij < n * (n + 1) / 2 ; q [ij++] = 0)
		;
	}
	else if (dimQ == 1)
	{
	    int ij = 0;
	    for (int j = 0 ; j < n ; j++)
	    {
		q [ij++] = Q [0];
		for (int i = 0 ; i < j ; i++)
		    q [ij++] = 0;
	    }
	}
	else if (dimQ == n)
	{
	    int ij = 0;
	    for (int j = 0 ; j < n ; j++)
	    {
		for (int i = 0 ; i < j ; i++)
		    q [ij++] = 0;
		q [ij++] = Q [j];
	    }
	}
	else if (dimQ == n * (n + 1) / 2)
	{
	    for (int ij = 0 ; ij < n * (n + 1) / 2 ; ij++)
		q [ij] = Q [ij];
	}
	else if (dimQ == n * n)
	{
	    int ij = 0;
	    for (int j = 0 ; j < n ; j++)
	    {
		for (int i = 0 ; i < j ; i++)
		    q [ij++] = (Q [i + j * n] + Q [j + i * n]) / 2;
		q [ij++] = Q [j + j * n];
	    }
	}
	else
	    return -2;
	return 0;
    }


    // Square-Root decomposition of a lower triangular matrix s[]
    //  On output, s[] containts l[] with s = l l^T

    static final /*nativez*/int calc (float s[],  /*const*/int l_[], int n)
    {
	for (int k = 0 ; k < n ; k++)
	{
	    int l0 = k + l_ [k];
	    float s0 = s [l0];
	    if (s0 <= 0)
	    {
		if (s0 < 0)
		    return -2;
		else
		    return -1;
	    }
	    s0 = (float) Math.sqrt (s0);
	    s [l0] = s0;
	    l0 = k + 1;
	    for (int j = l0 ; j < n ; j++)
	    {
		s [k + l_ [j]] /= s0;
		for (int i = l0 ; i <= j ; i++)
		{
		    s [i + l_ [j]] -= s [k + l_ [i]] * s [k + l_ [j]];
		}
	    }
	}
	return 0;
    }


    // Resolution of l l^T x = x
    //  On output x is replaced by the solution

    static final /*nativez*/void solve (  /*const*/float l[], float x[],  /*const*/int l_[], int n)
    {
	for (int j = 0 ; j < n ; j++)
	{
	    for (int i = 0 ; i < j ; i++)
		x [j] -= l [i + l_ [j]] * x [i];
	    x [j] /= l [j + l_ [j]];
	}
	for (int j = n - 1 ; j >= 0 ; j--)
	{
	    for (int i = j + 1 ; i < n ; i++)
		x [j] -= l [j + l_ [i]] * x [i];
	    x [j] /= l [j + l_ [j]];
	}
    }


    // Print a vector as a line

    static void print (String s, float v[])
    {
        salida = s + " = [ "; 
        String a="";
	NumberFormat nf = new DecimalFormat("##.0000");      
        
        for (int k = 0 ; k < v.length ; k++){
            System.out.print (v [k] + " ");
            a = nf.format(v[k]);
            salida = salida + a;
            salida = salida + "\t\t\t\t ";
        }
	System.out.println ("]");
        salida = salida + "] ";
        
    }


    static void tst ()
    {

	/* Test with :
	   L := matrix(3,3, [2,0,0,3,1,0,4,1,4]);
	   A := evalm(L &* transpose(L));
	   x := evalm(A &* vector(3, [1,2,3]));
	*/
	// Test at Java level
	int n = 3;
	float s[] = {6, 15, 55, 15, 55, 225, 55, 225,979}, x[] = {100, 150, 100};
	print ("x", new Cholesky (s, n).getX (x));
	// Test at the native level
	init (n);
	calc (s, l_, n);
	print ("l", s);
	solve (s, x, l_, n);
	print ("x", x);
    }
     
}

