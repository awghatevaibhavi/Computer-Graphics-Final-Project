//
//  shapes.java
//
//  Routines for shape-drawing functions.
//
//  @author Vasudev
//	@author Vaibhavi Awghate
//

public class shapes extends simpleShape {

	/**
	 * Object selection variables
	 */
	public static final int OBJ_QUAD = 0;
	public static final int OBJ_CONE = 1;
	public static final int OBJ_SPHERE = 2;

	/**
	 * Constructor
	 */
	public shapes() {
	}

	/**
	 * Each group of three values specifies a cone vertex
	 */
	float[] coneVertices = { -0.344407f, -0.223170f, -1.177754f, -0.149317f, -0.223170f, -1.158539f, 0.038276f,
			-0.223170f, -1.101634f, 0.211163f, -0.223170f, -1.009224f, 0.362700f, -0.223170f, -0.884861f, 0.487063f,
			-0.223170f, -0.733324f, 0.579473f, -0.223170f, -0.560438f, 0.636378f, -0.223170f, -0.372845f, 0.655593f,
			-0.223170f, -0.177754f, -0.344407f, 1.776830f, -0.177754f, 0.636378f, -0.223170f, 0.017336f, 0.579473f,
			-0.223170f, 0.204929f, 0.487063f, -0.223170f, 0.377816f, 0.362700f, -0.223170f, 0.529353f, 0.211163f,
			-0.223170f, 0.653715f, 0.038276f, -0.223170f, 0.746125f, -0.149317f, -0.223170f, 0.803031f, -0.344407f,
			-0.223170f, 0.822246f, -0.539498f, -0.223170f, 0.803031f, -0.727091f, -0.223170f, 0.746125f, -0.899978f,
			-0.223170f, 0.653715f, -1.051514f, -0.223170f, 0.529352f, -1.175877f, -0.223170f, 0.377815f, -1.268287f,
			-0.223170f, 0.204929f, -1.325192f, -0.223170f, 0.017335f, -1.344407f, -0.223170f, -0.177755f, -1.325192f,
			-0.223170f, -0.372846f, -1.268286f, -0.223170f, -0.560439f, -1.175876f, -0.223170f, -0.733325f, -1.051513f,
			-0.223170f, -0.884862f, -0.899976f, -0.223170f, -1.009225f, -0.727089f, -0.223170f, -1.101634f, -0.539496f,
			-0.223170f, -1.158540f,

	};

	/**
	 * Each pair of values specifies a vertex's texture coordinates
	 */

	int[] coneNormalIndices = { 0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9,
			9, 10, 10, 10, 11, 11, 11, 12, 12, 12, 13, 13, 13, 14, 14, 14, 15, 15, 15, 16, 16, 16, 17, 17, 17, 18, 18,
			18, 19, 19, 19, 20, 20, 20, 21, 21, 21, 22, 22, 22, 23, 23, 23, 24, 24, 24, 25, 25, 25, 26, 26, 26, 27, 27,
			27, 28, 28, 28, 29, 29, 29, 30, 30, 30, 31, 31, 31, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32,
			32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32,

	};

	float[] coneNormals = { 0.087800f, 0.445500f, -0.891000f, 0.259900f, 0.445500f, -0.856700f, 0.422000f, 0.445500f,
			-0.789600f, 0.568000f, 0.445500f, -0.692100f, 0.692100f, 0.445500f, -0.568000f, 0.789600f, 0.445500f,
			-0.422000f, 0.856700f, 0.445500f, -0.259900f, 0.891000f, 0.445500f, -0.087800f, 0.891000f, 0.445500f,
			0.087800f, 0.856700f, 0.445500f, 0.259900f, 0.789600f, 0.445500f, 0.422000f, 0.692100f, 0.445500f,
			0.568000f, 0.568000f, 0.445500f, 0.692100f, 0.422000f, 0.445500f, 0.789600f, 0.259900f, 0.445500f,
			0.856700f, 0.087800f, 0.445500f, 0.891000f, -0.087800f, 0.445500f, 0.891000f, -0.259900f, 0.445500f,
			0.856700f, -0.422000f, 0.445500f, 0.789600f, -0.568000f, 0.445500f, 0.692100f, -0.692100f, 0.445500f,
			0.568000f, -0.789600f, 0.445500f, 0.422000f, -0.856700f, 0.445500f, 0.259900f, -0.891000f, 0.445500f,
			0.087800f, -0.891000f, 0.445500f, -0.087800f, -0.856700f, 0.445500f, -0.259900f, -0.789600f, 0.445500f,
			-0.422000f, -0.692100f, 0.445500f, -0.568000f, -0.568000f, 0.445500f, -0.692100f, -0.422000f, 0.445500f,
			-0.789600f, -0.259900f, 0.445500f, -0.856700f, -0.087800f, 0.445500f, -0.891000f, 0.000000f, -1.000000f,
			-0.000000f,

	};

	int[] coneElements = { 0, 9, 1, 1, 9, 2, 2, 9, 3, 3, 9, 4, 4, 9, 5, 5, 9, 6, 6, 9, 7, 7, 9, 8, 8, 9, 10, 10, 9, 11,
			11, 9, 12, 12, 9, 13, 13, 9, 14, 14, 9, 15, 15, 9, 16, 16, 9, 17, 17, 9, 18, 18, 9, 19, 19, 9, 20, 20, 9,
			21, 21, 9, 22, 22, 9, 23, 23, 9, 24, 24, 9, 25, 25, 9, 26, 26, 9, 27, 27, 9, 28, 28, 9, 29, 29, 9, 30, 30,
			9, 31, 31, 9, 32, 32, 9, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22,
			23, 24, 25, 26, 27, 28, 29, 30, 31, 32,

	};

	/**
	 * makeCone() - create a cone object
	 */
	private void makeCone() {
		for (int i = 0; i < coneElements.length - 2; i += 3) {

			// calculate the base indices of the three vertices
			int point1 = 3 * coneElements[i]; // slots 0, 1, 2
			int point2 = 3 * coneElements[i + 1]; // slots 3, 4, 5
			int point3 = 3 * coneElements[i + 2]; // slots 6, 7, 8

			int normal1 = 3 * coneNormalIndices[i];
			int normal2 = 3 * coneNormalIndices[i + 1];
			int normal3 = 3 * coneNormalIndices[i + 2];

			addTriangleWithNorms(coneVertices[point1 + 0], coneVertices[point1 + 1], coneVertices[point1 + 2],
					coneNormals[normal1 + 0], coneNormals[normal1 + 1], coneNormals[normal1 + 2],

					coneVertices[point2 + 0], coneVertices[point2 + 1], coneVertices[point2 + 2],
					coneNormals[normal2 + 0], coneNormals[normal2 + 1], coneNormals[normal2 + 2],

					coneVertices[point3 + 0], coneVertices[point3 + 1], coneVertices[point3 + 2],
					coneNormals[normal3 + 0], coneNormals[normal3 + 1], coneNormals[normal3 + 2]);
		}
	}

	/**
	 * Each group of three values specifies a quad vertex
	 */
	float[] quadVertices = {
			// top row
			-0.50f, 0.50f, 0.50f, -0.25f, 0.50f, 0.50f, 0.00f, 0.50f, 0.50f, 0.25f, 0.50f, 0.50f, 0.50f, 0.50f, 0.50f,
			// second row
			-0.50f, 0.25f, 0.50f, -0.25f, 0.25f, 0.50f, 0.00f, 0.25f, 0.50f, 0.25f, 0.25f, 0.50f, 0.50f, 0.25f, 0.50f,
			// third (middle) row
			-0.50f, 0.00f, 0.50f, -0.25f, 0.00f, 0.50f, 0.00f, 0.00f, 0.50f, 0.25f, 0.00f, 0.50f, 0.50f, 0.00f, 0.50f,
			// fourth row
			-0.50f, -0.25f, 0.50f, -0.25f, -0.25f, 0.50f, 0.00f, -0.25f, 0.50f, 0.25f, -0.25f, 0.50f, 0.50f, -0.25f,
			0.50f,
			// fifth (last) row
			-0.50f, -0.50f, 0.50f, -0.25f, -0.50f, 0.50f, 0.00f, -0.50f, 0.50f, 0.25f, -0.50f, 0.50f, 0.50f, -0.50f,
			0.50f };

	/**
	 * Each pair of values specifies a vertex's texture coordinates
	 */

	float[] quadUV = {
			// top row
			0.00f, 1.00f, 0.25f, 1.00f, 0.50f, 1.00f, 0.75f, 1.00f, 1.00f, 1.00f,
			// second row
			0.00f, 0.75f, 0.25f, 0.75f, 0.50f, 0.75f, 0.75f, 0.75f, 1.00f, 0.75f,
			// third (middle) row
			0.00f, 0.50f, 0.25f, 0.50f, 0.50f, 0.50f, 0.75f, 0.50f, 1.00f, 0.50f,
			// fourth row
			0.00f, 0.25f, 0.25f, 0.25f, 0.50f, 0.25f, 0.75f, 0.25f, 1.00f, 0.25f,
			// fifth (last) row
			0.00f, 0.00f, 0.25f, 0.00f, 0.50f, 0.00f, 0.75f, 0.00f, 1.00f, 0.00f };

	/**
	 * Because the quad faces +Z, all the normals are (0,0,1)
	 */
	float[] quadNormals = { 0.0f, 0.0f, 1.0f };

	/**
	 * Each group of three entries specifies a triangle for the quad
	 */
	int[] quadElements = {
			// top row
			0, 5, 1, 5, 6, 1, 1, 6, 2, 6, 7, 2, 2, 7, 3, 7, 8, 3, 3, 8, 4, 8, 9, 4,
			// second row
			5, 10, 6, 10, 11, 6, 6, 11, 7, 11, 12, 7, 7, 12, 8, 12, 13, 8, 8, 13, 9, 13, 14, 9,
			// third row
			10, 15, 11, 15, 16, 11, 11, 16, 12, 16, 17, 12, 12, 17, 13, 17, 18, 13, 13, 18, 14, 18, 19, 14,
			// fourth row
			15, 20, 16, 20, 21, 16, 16, 21, 17, 21, 22, 17, 17, 22, 18, 22, 23, 18, 18, 23, 19, 23, 24, 19 };

	/**
	 * makeQuad() - create a quad object
	 */
	private void makeQuad() {
		int i;

		for (i = 0; i < quadElements.length - 2; i += 3) {

			// Calculate the base indices of the three vertices
			int point1 = 3 * quadElements[i]; // slots 0, 1, 2
			int point2 = 3 * quadElements[i + 1]; // slots 3, 4, 5
			int point3 = 3 * quadElements[i + 2]; // slots 6, 7, 8

			// Calculate the base indices of the three texture coordinates
			int normal1 = 2 * quadElements[i]; // slots 0, 1, 2
			int normal2 = 2 * quadElements[i + 1]; // slots 3, 4, 5
			int normal3 = 2 * quadElements[i + 2]; // slots 6, 7, 8

			// Add triangle and texture coordinates
			addTriangleWithUV(quadVertices[point1 + 0], quadVertices[point1 + 1], quadVertices[point1 + 2],
					quadUV[normal1 + 0], quadUV[normal1 + 1], quadVertices[point2 + 0], quadVertices[point2 + 1],
					quadVertices[point2 + 2], quadUV[normal2 + 0], quadUV[normal2 + 1], quadVertices[point3 + 0],
					quadVertices[point3 + 1], quadVertices[point3 + 2], quadUV[normal3 + 0], quadUV[normal3 + 1]);

		}

	}
	
	/**
	 * Each group of three values specifies a sphere vertex
	 */
	float sphereVertices[] = { 0.006778f, -0.998579f, -0.007225f, 0.730385f, -0.445799f, 0.518501f, -0.269610f,
			-0.445799f, 0.843424f, -0.887648f, -0.445795f, -0.007225f, -0.269610f, -0.445799f, -0.857874f, 0.730385f,
			-0.445799f, -0.532950f, 0.283166f, 0.448641f, 0.843424f, -0.716829f, 0.448640f, 0.518501f, -0.716829f,
			0.448640f, -0.532950f, 0.283166f, 0.448641f, -0.857874f, 0.901204f, 0.448636f, -0.007225f, 0.006778f,
			1.001421f, -0.007225f, -0.155678f, -0.849234f, 0.492771f, 0.432101f, -0.849233f, 0.301787f, 0.269647f,
			-0.524317f, 0.801787f, 0.857426f, -0.524315f, -0.007225f, 0.432101f, -0.849233f, -0.316236f, -0.518952f,
			-0.849231f, -0.007225f, -0.681412f, -0.524315f, 0.492772f, -0.155678f, -0.849234f, -0.507220f, -0.681412f,
			-0.524315f, -0.507222f, 0.269647f, -0.524317f, -0.816236f, 0.957836f, 0.001421f, 0.301788f, 0.957836f,
			0.001421f, -0.316237f, 0.006778f, 0.001421f, 0.992775f, 0.594563f, 0.001421f, 0.801792f, -0.944280f,
			0.001421f, 0.301788f, -0.581008f, 0.001421f, 0.801792f, -0.581008f, 0.001421f, -0.816241f, -0.944280f,
			0.001421f, -0.316237f, 0.594563f, 0.001421f, -0.816241f, 0.006778f, 0.001421f, -1.007225f, 0.694967f,
			0.527157f, 0.492772f, -0.256091f, 0.527158f, 0.801787f, -0.843870f, 0.527157f, -0.007225f, -0.256091f,
			0.527158f, -0.816236f, 0.694967f, 0.527157f, -0.507222f, 0.169233f, 0.852075f, 0.492771f, 0.532508f,
			0.852073f, -0.007225f, -0.418545f, 0.852075f, 0.301787f, -0.418545f, 0.852075f, -0.316236f, 0.169233f,
			0.852075f, -0.507220f,

	};

	int sphereNormalIndices[] = { 0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9,
			9, 10, 10, 10, 11, 11, 11, 12, 12, 12, 13, 13, 13, 14, 14, 14, 15, 15, 15, 16, 16, 16, 17, 17, 17, 18, 18,
			18, 19, 19, 19, 20, 20, 20, 21, 21, 21, 22, 22, 22, 23, 23, 23, 24, 24, 24, 25, 25, 25, 26, 26, 26, 27, 27,
			27, 28, 28, 28, 29, 29, 29, 30, 30, 30, 31, 31, 31, 32, 32, 32, 33, 33, 33, 34, 34, 34, 35, 35, 35, 36, 36,
			36, 37, 37, 37, 38, 38, 38, 39, 39, 39, 40, 40, 40, 41, 41, 41, 42, 42, 42, 43, 43, 43, 44, 44, 44, 45, 45,
			45, 46, 46, 46, 47, 47, 47, 48, 48, 48, 49, 49, 49, 50, 50, 50, 51, 51, 51, 52, 52, 52, 53, 53, 53, 54, 54,
			54, 55, 55, 55, 56, 56, 56, 57, 57, 57, 58, 58, 58, 59, 59, 59, 60, 60, 60, 61, 61, 61, 62, 62, 62, 63, 63,
			63, 64, 64, 64, 65, 65, 65, 66, 66, 66, 67, 67, 67, 68, 68, 68, 69, 69, 69, 70, 70, 70, 71, 71, 71, 72, 72,
			72, 73, 73, 73, 74, 74, 74, 75, 75, 75, 76, 76, 76, 77, 77, 77, 78, 78, 78, 79, 79, 79,

	};

	int sphereElements[] = { 0, 13, 12, 1, 13, 15, 0, 12, 17, 0, 17, 19, 0, 19, 16, 1, 15, 22, 2, 14, 24, 3, 18, 26, 4,
			20, 28, 5, 21, 30, 1, 22, 25, 2, 24, 27, 3, 26, 29, 4, 28, 31, 5, 30, 23, 6, 32, 37, 7, 33, 39, 8, 34, 40,
			9, 35, 41, 10, 36, 38, 38, 41, 11, 38, 36, 41, 36, 9, 41, 41, 40, 11, 41, 35, 40, 35, 8, 40, 40, 39, 11, 40,
			34, 39, 34, 7, 39, 39, 37, 11, 39, 33, 37, 33, 6, 37, 37, 38, 11, 37, 32, 38, 32, 10, 38, 23, 36, 10, 23,
			30, 36, 30, 9, 36, 31, 35, 9, 31, 28, 35, 28, 8, 35, 29, 34, 8, 29, 26, 34, 26, 7, 34, 27, 33, 7, 27, 24,
			33, 24, 6, 33, 25, 32, 6, 25, 22, 32, 22, 10, 32, 30, 31, 9, 30, 21, 31, 21, 4, 31, 28, 29, 8, 28, 20, 29,
			20, 3, 29, 26, 27, 7, 26, 18, 27, 18, 2, 27, 24, 25, 6, 24, 14, 25, 14, 1, 25, 22, 23, 10, 22, 15, 23, 15,
			5, 23, 16, 21, 5, 16, 19, 21, 19, 4, 21, 19, 20, 4, 19, 17, 20, 17, 3, 20, 17, 18, 3, 17, 12, 18, 12, 2, 18,
			15, 16, 5, 15, 13, 16, 13, 0, 16, 12, 14, 2, 12, 13, 14, 13, 1, 14,

	};

	float sphereNormals[] = { 0.102400f, -0.943500f, 0.315100f, 0.700200f, -0.661700f, 0.268000f, -0.268000f,
			-0.943500f, 0.194700f, -0.268000f, -0.943500f, -0.194700f, 0.102400f, -0.943500f, -0.315100f, 0.905000f,
			-0.330400f, 0.268000f, 0.024700f, -0.330400f, 0.943500f, -0.889700f, -0.330400f, 0.315100f, -0.574600f,
			-0.330400f, -0.748800f, 0.534600f, -0.330400f, -0.777900f, 0.802600f, -0.125600f, 0.583100f, -0.306600f,
			-0.125600f, 0.943500f, -0.992100f, -0.125600f, 0.000000f, -0.306600f, -0.125600f, -0.943500f, 0.802600f,
			-0.125600f, -0.583100f, 0.408900f, 0.661700f, 0.628400f, -0.471300f, 0.661700f, 0.583100f, -0.700200f,
			0.661700f, -0.268000f, 0.038500f, 0.661700f, -0.748800f, 0.724000f, 0.661700f, -0.194700f, 0.268000f,
			0.943500f, -0.194700f, 0.491100f, 0.794700f, -0.356800f, 0.408900f, 0.661700f, -0.628400f, -0.102400f,
			0.943500f, -0.315100f, -0.187600f, 0.794700f, -0.577300f, -0.471300f, 0.661700f, -0.583100f, -0.331300f,
			0.943500f, 0.000000f, -0.607100f, 0.794700f, 0.000000f, -0.700200f, 0.661700f, 0.268000f, -0.102400f,
			0.943500f, 0.315100f, -0.187600f, 0.794700f, 0.577300f, 0.038500f, 0.661700f, 0.748800f, 0.268000f,
			0.943500f, 0.194700f, 0.491100f, 0.794700f, 0.356800f, 0.724000f, 0.661700f, 0.194700f, 0.889700f,
			0.330400f, -0.315100f, 0.794700f, 0.187600f, -0.577300f, 0.574600f, 0.330400f, -0.748800f, -0.024700f,
			0.330400f, -0.943500f, -0.303500f, 0.187600f, -0.934200f, -0.534600f, 0.330400f, -0.777900f, -0.905000f,
			0.330400f, -0.268000f, -0.982200f, 0.187600f, 0.000000f, -0.905000f, 0.330400f, 0.268000f, -0.534600f,
			0.330400f, 0.777900f, -0.303500f, 0.187600f, 0.934200f, -0.024700f, 0.330400f, 0.943500f, 0.574600f,
			0.330400f, 0.748800f, 0.794700f, 0.187600f, 0.577300f, 0.889700f, 0.330400f, 0.315100f, 0.306600f,
			0.125600f, -0.943500f, 0.303500f, -0.187600f, -0.934200f, 0.024700f, -0.330400f, -0.943500f, -0.802600f,
			0.125600f, -0.583100f, -0.794700f, -0.187600f, -0.577300f, -0.889700f, -0.330400f, -0.315100f, -0.802600f,
			0.125600f, 0.583100f, -0.794700f, -0.187600f, 0.577300f, -0.574600f, -0.330400f, 0.748800f, 0.306600f,
			0.125600f, 0.943500f, 0.303500f, -0.187600f, 0.934200f, 0.534600f, -0.330400f, 0.777900f, 0.992100f,
			0.125600f, 0.000000f, 0.982200f, -0.187600f, 0.000000f, 0.905000f, -0.330400f, -0.268000f, 0.471300f,
			-0.661700f, -0.583100f, 0.187600f, -0.794700f, -0.577300f, -0.038500f, -0.661700f, -0.748800f, -0.408900f,
			-0.661700f, -0.628400f, -0.491100f, -0.794700f, -0.356800f, -0.724000f, -0.661700f, -0.194700f, -0.724000f,
			-0.661700f, 0.194700f, -0.491100f, -0.794700f, 0.356800f, -0.408900f, -0.661700f, 0.628400f, 0.700200f,
			-0.661700f, -0.268000f, 0.607100f, -0.794700f, 0.000000f, 0.331300f, -0.943500f, 0.000000f, -0.038500f,
			-0.661700f, 0.748800f, 0.187600f, -0.794700f, 0.577300f, 0.471300f, -0.661700f, 0.583100f,

	};
	
	/**
	 * makeSphere() - create a sphere object
	 */
	private void makeSphere() {
		for (int i = 0; i < sphereElements.length - 2; i += 3) {

			// calculate the base indices of the three vertices
			int point1 = 3 * sphereElements[i]; // slots 0, 1, 2
			int point2 = 3 * sphereElements[i + 1]; // slots 3, 4, 5
			int point3 = 3 * sphereElements[i + 2]; // slots 6, 7, 8

			int normal1 = 3 * sphereNormalIndices[i];
			int normal2 = 3 * sphereNormalIndices[i + 1];
			int normal3 = 3 * sphereNormalIndices[i + 2];

			addTriangleWithNorms(sphereVertices[point1 + 0], sphereVertices[point1 + 1], sphereVertices[point1 + 2],
					sphereNormals[normal1 + 0], sphereNormals[normal1 + 1], sphereNormals[normal1 + 2],

					sphereVertices[point2 + 0], sphereVertices[point2 + 1], sphereVertices[point2 + 2],
					sphereNormals[normal2 + 0], sphereNormals[normal2 + 1], sphereNormals[normal2 + 2],

					sphereVertices[point3 + 0], sphereVertices[point3 + 1], sphereVertices[point3 + 2],
					sphereNormals[normal3 + 0], sphereNormals[normal3 + 1], sphereNormals[normal3 + 2]);
		}
	}

	/**
	 * Make either a quad, cone or sphere
	 * 
	 * @param choice
	 *            - 0 for quad, 1 for cone and 2 for sphere
	 */
	public void makeShape(int choice) {
		if (choice == shapes.OBJ_QUAD)
			makeQuad();
		else if (choice == shapes.OBJ_CONE)
			makeCone();
		else
			makeSphere();
	}

}