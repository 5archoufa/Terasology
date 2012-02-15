package org.terasology.data.shapes

shape {
	Center {
		vertices = [[0.500000, 0.000000, 0.000000], [0.500000, 0.500000, 0.000000], [-0.500000, 0.500000, -0.000000], [-0.500000, 0.000000, -0.000000], [0.500000, 0.000000, 0.000000], [-0.500000, 0.000000, -0.000000], [-0.500000, 0.000000, 0.500000], [0.500000, 0.000000, 0.500000]]
		normals = [[-0.000000, 0.000000, 1.000000], [-0.000000, 0.000000, 1.000000], [-0.000000, 0.000000, 1.000000], [-0.000000, 0.000000, 0.999969], [-0.000000, 1.000000, 0.000000], [-0.000000, 1.000000, 0.000000], [-0.000000, 1.000000, 0.000000], [-0.000000, 1.000000, 0.000000]]
		texcoords = [[1.000000, 0.500000], [1.000000, 0.000000], [0.000000, 0.000000], [0.000000, 0.500000], [0.999999, 0.500000], [0.000000, 0.500000], [0.000000, 0.999999], [0.999999, 1.000000]]
		faces = [
			[0, 1, 2, 3],
			[4, 5, 6, 7]
		]
		fullSide = false
	}
	Top {
		vertices = [[-0.500000, 0.500000, -0.500000], [-0.500000, 0.500000, -0.000000], [0.500000, 0.500000, 0.000000], [0.500000, 0.500000, -0.500000]]
		normals = [[-0.000000, 1.000000, 0.000000], [-0.000000, 1.000000, 0.000000], [-0.000000, 1.000000, 0.000000], [-0.000000, 1.000000, 0.000000]]
		texcoords = [[0.000000, 0.000000], [0.000000, 0.500000], [1.000000, 0.500000], [1.000000, 0.000000]]
		faces = [
			[0, 1, 2, 3]
		]
		fullSide = false
	}
	Bottom {
		vertices = [[-0.500000, -0.500000, 0.500000], [-0.500000, -0.500000, -0.500000], [0.500000, -0.500000, -0.500000], [0.500000, -0.500000, 0.500000]]
		normals = [[-0.000000, -0.999969, 0.000000], [-0.000000, -1.000000, 0.000000], [-0.000000, -1.000000, 0.000000], [-0.000000, -0.999969, 0.000000]]
		texcoords = [[0.000000, 0.000000], [0.000000, 1.000000], [1.000000, 1.000000], [1.000000, 0.000000]]
		faces = [
			[0, 1, 2, 3]
		]
		fullSide = true
	}
	Front {
		vertices = [[0.500000, 0.500000, -0.500000], [0.500000, -0.500000, -0.500000], [-0.500000, -0.500000, -0.500000], [-0.500000, 0.500000, -0.500000]]
		normals = [[-0.000000, 0.000000, -1.000000], [-0.000000, 0.000000, -1.000000], [-0.000000, 0.000000, -0.999969], [-0.000000, 0.000000, -1.000000]]
		texcoords = [[0.000000, 0.000000], [0.000000, 1.000000], [1.000000, 1.000000], [1.000000, 0.000000]]
		faces = [
			[0, 1, 2, 3]
		]
		fullSide = true
	}
	Back {
		vertices = [[0.500000, -0.500000, 0.500000], [0.500000, 0.000000, 0.500000], [-0.500000, 0.000000, 0.500000], [-0.500000, -0.500000, 0.500000]]
		normals = [[-0.000000, 0.000000, 1.000000], [-0.000000, 0.000000, 1.000000], [-0.000000, 0.000000, 1.000000], [-0.000000, 0.000000, 1.000000]]
		texcoords = [[1.000000, 1.000000], [1.000000, 0.500000], [0.000000, 0.500000], [0.000000, 1.000000]]
		faces = [
			[0, 1, 2, 3]
		]
		fullSide = false
	}
	Left {
		vertices = [[-0.500000, 0.000000, -0.000000], [-0.500000, 0.500000, -0.000000], [-0.500000, 0.500000, -0.500000], [-0.500000, -0.500000, 0.500000], [-0.500000, 0.000000, 0.500000], [-0.500000, 0.000000, -0.000000], [-0.500000, -0.500000, -0.500000], [-0.500000, 0.000000, -0.000000], [-0.500000, 0.500000, -0.500000], [-0.500000, -0.500000, 0.500000], [-0.500000, 0.000000, -0.000000], [-0.500000, -0.500000, -0.500000]]
		normals = [[-1.000000, 0.000000, -0.000000], [-1.000000, 0.000000, -0.000000], [-1.000000, 0.000000, -0.000000], [-1.000000, -0.000000, 0.000000], [-1.000000, -0.000000, 0.000000], [-1.000000, -0.000000, 0.000000], [-1.000000, -0.000000, -0.000001], [-1.000000, -0.000000, -0.000001], [-1.000000, -0.000000, -0.000001], [-1.000000, -0.000001, -0.000000], [-1.000000, -0.000001, -0.000000], [-1.000000, -0.000001, -0.000000]]
		texcoords = [[0.500000, 0.500000], [0.500000, 0.000000], [0.000000, 0.000000], [1.000000, 1.000000], [1.000000, 0.500000], [0.500000, 0.500000], [0.000000, 1.000000], [0.500000, 0.500000], [0.000000, 0.000000], [1.000000, 1.000000], [0.500000, 0.500000], [0.000000, 1.000000]]
		faces = [
			[0, 1, 2],
			[3, 4, 5],
			[6, 7, 8],
			[9, 10, 11]
		]
		fullSide = false
	}
	Right {
		vertices = [[0.500000, -0.500000, 0.500000], [0.500000, 0.000000, 0.000000], [0.500000, 0.000000, 0.500000], [0.500000, 0.000000, 0.000000], [0.500000, 0.500000, -0.500000], [0.500000, 0.500000, 0.000000], [0.500000, -0.500000, -0.500000], [0.500000, 0.000000, 0.000000], [0.500000, -0.500000, 0.500000], [0.500000, -0.500000, -0.500000], [0.500000, 0.500000, -0.500000], [0.500000, 0.000000, 0.000000]]
		normals = [[0.999969, 0.000000, 0.000000], [1.000000, 0.000000, 0.000000], [1.000000, 0.000000, 0.000000], [1.000000, 0.000000, 0.000000], [1.000000, 0.000000, 0.000000], [0.999969, 0.000000, 0.000000], [1.000000, 0.000000, 0.000000], [1.000000, 0.000000, 0.000000], [0.999969, 0.000000, 0.000000], [1.000000, 0.000000, 0.000000], [1.000000, 0.000000, 0.000000], [1.000000, 0.000000, 0.000000]]
		texcoords = [[0.000000, 1.000000], [0.500000, 0.500000], [0.000000, 0.500000], [0.500000, 0.500000], [1.000000, 0.000000], [0.500000, 0.000000], [1.000000, 1.000000], [0.500000, 0.500000], [0.000000, 1.000000], [1.000000, 1.000000], [1.000000, 0.000000], [0.500000, 0.500000]]
		faces = [
			[0, 1, 2],
			[3, 4, 5],
			[6, 7, 8],
			[9, 10, 11]
		]
		fullSide = false
	}
}
