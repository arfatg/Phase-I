package com.lockedme;

public class LockedMeMain {

	public static void main(String[] args) 
	{
		{
			
						FileOperations.createMainFolderIfNotPresent("main");
			
			MenuOptions.printWelcomeScreen("LockedMe", "Arfat G. Shaikh");
			
			HandleOptions.handleWelcomeScreenInput();
		}

		// TODO Auto-generated method stub

	}

}
