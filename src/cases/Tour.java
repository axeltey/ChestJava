package cases;
import principal.*;

public class Tour extends Piece{

	public Tour(Couleur couleur){
		super(couleur);
	}
	
	public String toString() {
		return "tour " + super.toString();
	}
}
