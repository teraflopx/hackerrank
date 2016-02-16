 //https://www.hackerrank.com/challenges/functions-and-fractals-sierpinski-triangles

object SierpinskiTriangles extends App {

	val Rows = 32
	val Columns = 63
	val Center = 31

	// iteration 0: triangle = 32 rows x 63 columns
	// iteration 1: triangle = 16 rows x 31 columns >> 16 = 32 / 2; 31 = (63 - 1) / 2
	// iteration 2: triangle = 8 rows x 15 columns
	// iteration 3: triangle = 4 rows x 7 columns
	// iteration 4: triangle = 2 rows x 3 columns
	// iteration 5: triangle = 1 row x 1 column

	// first generate triangle iteration 0
	// at each iteration an input is the triangle from the previous iteration, and then, based on the indexes, we change elements from 1 to _
	
	val n = io.StdIn.readInt // number of iterations (n <= 5)
}