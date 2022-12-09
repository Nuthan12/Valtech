package valtech.ws;

public class PointArithmeticImpl implements PointArithmetic {


		@Override
		public Point add(Point a,Point b){
			Point res=new Point();
			res.setX(a.getX()+b.getX());
			res.setY(a.getY()+b.getY());
			return res;
		}
		
		
		@Override
		public Point sub(Point a,Point b){
			Point res=new Point();
			res.setX(a.getX()-b.getX());
			res.setY(a.getY()-b.getY());
			return res;
		}

}
