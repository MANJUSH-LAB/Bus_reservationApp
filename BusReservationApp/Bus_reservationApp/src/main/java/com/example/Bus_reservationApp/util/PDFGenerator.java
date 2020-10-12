package com.example.Bus_reservationApp.util;

import java.io.FileOutputStream;

import org.springframework.stereotype.Component;

import com.example.Bus_reservationApp.Entities.Reservation;
import com.itextpdf.text.Document;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@Component
public class PDFGenerator {

	public void generateItinerary(Reservation reservation, String filePath) {

		Document document = new Document();
		try {

			PdfWriter.getInstance(document, new FileOutputStream(filePath));
			document.open();
			document.add(generateTable(reservation));
			document.close();

		} catch (Exception e) {

			System.out.println(e);

		}

	}

	private PdfPTable generateTable(Reservation reservation) {

		PdfPTable table = new PdfPTable(2);
		PdfPCell cell;

		cell = new PdfPCell(new Phrase("Bus Itinerary"));
		cell.setColspan(2);
		table.addCell(cell);

		cell = new PdfPCell(new Phrase("Bus Details"));
		cell.setColspan(2);
		table.addCell(cell);

		table.addCell("Departure City");
		table.addCell(reservation.getBus().getDepartureCity());

		table.addCell("Arrival City");
		table.addCell(reservation.getBus().getArrivalCity());

		table.addCell("Bus Number");
		table.addCell(reservation.getBus().getBusNumber());

		table.addCell("Operating Traveler");
		table.addCell(reservation.getBus().getOperatingTraveler());

		table.addCell("Departure Date");
		table.addCell(reservation.getBus().getDateOfDeparture().toString());

		table.addCell("Departure time");
		table.addCell(reservation.getBus().getEstimatedDepartureTime().toString());

		cell = new PdfPCell(new Phrase("Passenger Details"));
		cell.setColspan(2);
		table.addCell(cell);

		table.addCell("First Name");
		table.addCell(reservation.getPassenger().getFirstName());

		table.addCell("Last Name");
		table.addCell(reservation.getPassenger().getLastName());

		table.addCell("Email");
		table.addCell(reservation.getPassenger().getEmail());

		table.addCell("Mobile Number");
		table.addCell(reservation.getPassenger().getPhone());

		return table;
	}

}