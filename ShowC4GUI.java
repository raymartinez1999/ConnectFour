package ConnectFour;

public class ShowC4GUI {

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater( new Runnable(){
			@Override
			public void run() {
				C4_GUI gui = new C4_GUI();
			}
		});
	}

}
