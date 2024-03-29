package CreationalPatterns.AbstractFactory;

public class RoundedShapeFactory extends AbstractFactory{

	@Override
	public Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new RoundedRectangle();         
	      } else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new RoundedSquare();
	      }	 
	      return null;
	}
}
