package Activity5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PayementCarte carte=new PayementCarte();
		PayementPaypal paypal=new PayementPaypal();
		Article sony=new Article("playstation",150);
		sony.payer(paypal);
		sony.payer(carte);
	}

}
