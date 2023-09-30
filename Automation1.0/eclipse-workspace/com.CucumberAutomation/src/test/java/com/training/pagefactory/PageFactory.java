package com.training.pagefactory;
import java.io.IOException;
import java.util.HashMap;
import com.training.base.BasePage;


public class PageFactory {

static com.trining.utilities.CommonUtilities common = new com.trining.utilities.CommonUtilities();
	
	static final HashMap<String, String> packageClassMap = new HashMap<String, String>();

	public static String getPackage() throws IOException {
	String packageName= common.getapplicationProperty("page.packages");
	return packageName;
	}
			
	@SuppressWarnings("deprecation")
	public BasePage initialize(String pageName) {
		BasePage page = null;
		String packagename = null;
		try {
			packagename = getPackage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String pageClassFullName = packagename + "."
				+ pageName;
		try {
			page = (BasePage) Class.forName(pageClassFullName)
					.newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		/*String formattedPageName = getRemovedSpaceName(pageName);
		try {
			String packageName = packageClassMap.get(formattedPageName);
			if (packageName != null) {
				String pageClassFullName = packageName + "."
						+ formattedPageName;
				page = (BasePage) Class.forName(pageClassFullName)
						.newInstance();
			} else {
				System.out.println("Page Class with" + formattedPageName
						+ "Doesn't exist .Please provide valid page Name");*/
		return page;	
		}

		/*} catch (Exception e) {
			e.printStackTrace();
			
		}*/
		
		

	//}

	
}
