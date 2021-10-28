package MainAppDriver;

import java.io.IOException;

import SalesWork.SalesWorkHadoop.App;
import SalesWork.SalesWorkHadoop.SecondApp.SecondApp;
import SalesWork.SalesWorkHadoop.ThirdApp.ThirdApp;

public class MainAppDriver {

	public static void main(String[] args) throws IOException {
	
		App firstExcs = new App();
		firstExcs.FirstExcs();
		SecondApp secondExcs = new SecondApp();
		secondExcs.SecondExcs();
		ThirdApp thirdExcs = new ThirdApp();
		thirdExcs.ThirdExcs();
	}

}
