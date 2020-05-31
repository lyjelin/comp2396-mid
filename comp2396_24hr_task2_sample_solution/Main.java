package comp2396_24hr_task2_sample_solution;

import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				Model model = new Model();
				View view = new View();
				Controller controller = new Controller(model, view);
				controller.start();
			}
		});

	}

}