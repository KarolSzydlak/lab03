package pl.edu.pwr.kszydlak.Method;

import pl.edu.pwr.kszydlak.Module.Complaint;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ReportComplaint {
    static ArrayList<Complaint> complaints = new ArrayList<Complaint>();
    File plik = new File("complaints_list.txt");
    public static void report_complaint() throws FileNotFoundException {
        Complaint complaint = new Complaint();
        System.out.println("Zgłaszasz reklamację, podaj id klienta:");
        Scanner scan = new Scanner(System.in);
        complaint.setId(complaints.size());
        System.out.println("Podaj id produktu:");
        complaint.setItemid(scan.nextInt());
        scan.nextLine();
        System.out.println("Podaj opis produktu:");
        complaint.setDescription(scan.nextLine());
        complaint.setStatus("Złożona");
        scan.close();
        PrintWriter write = new PrintWriter("complaints_list.txt");
        write.printf("%d",complaint.getId());
        complaints.add(complaint);
    }
}
