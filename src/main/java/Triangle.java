import java.util.Arrays;
class Triangle{
	double side1, side2, side3;

	public Triangle(double s1, double s2, double s3) throws TriangleException{
		double sides[] = {s1, s2, s3};	
		Arrays.sort(sides);
		side1 = sides[0];
		side2 = sides[1];
		side3 = sides[2];

		if(side1 == 0 || side2 == 0 || side3 == 0){
			throw new TriangleException();
		}

		if(side1 < 0 || side2 < 0 || side3 < 0){
			throw new TriangleException();
		}

		if(side1 + side2 <= side3){
			throw new TriangleException();
		}


	}

	public TriangleKind getKind(){
		if(side1 == side2 && side2 == side3){
			return TriangleKind.EQUILATERAL;
		}
		
		else if(side1 == side2 || side2 == side3 || side1 == side3){
			return TriangleKind.ISOSCELES;
		}

		else{
			return TriangleKind.SCALENE;
		}
	}
}
	

