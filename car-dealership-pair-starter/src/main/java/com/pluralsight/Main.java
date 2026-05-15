package main.java.com.pluralsight;

import main.java.com.pluralsight.application.DealershipApplication;
import main.java.com.pluralsight.models.Dealership;
import main.java.com.pluralsight.io.DealershipFileManager;

import java.io.IOException;

public class Main
{
    static void main()
    {
        try
        {
            Dealership dealership = DealershipFileManager.loadDealership();
            DealershipApplication app = new DealershipApplication(dealership);
            app.run();
        }
        catch(IOException e)
        {
            System.out.println("There was an error reading the data file.");
        }
    }
}
