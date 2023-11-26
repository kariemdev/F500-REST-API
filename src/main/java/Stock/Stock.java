package Stock;
import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Stocks")
public class Stock {
    private String name;
    private String symbol;
    private double value;
    private LocalDate date;


    public Stock(String name, double value , String symbol ) {
        this.name = name;
        this.value = value;
        this.symbol = symbol;
        this.date = LocalDate.now();
    }
    public String getSymbol() {
        return symbol;
    }
    public String setSymbol(String symbol) {
        return this.symbol = symbol;
    }
    public String getName() {
        return name;
    }
    public double getValue() {
        return value;
    }
    public void setValue(double value) {
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }

}
