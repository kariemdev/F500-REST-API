package Stock;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/stocks")
public class StockController {

    private final StockService stockService;
    @Autowired
    public StockController(StockService stockService) {
        this.stockService = stockService;
    }
    @GetMapping()
    public List<Stock> stock(){
        return stockService.getStocks();
    }
    @PostMapping("/add")
    public ResponseEntity<Stock> addStock(@RequestBody Stock stock){
        Stock createdStock = stockService.addStock(stock);
        return new ResponseEntity<>(createdStock, org.springframework.http.HttpStatus.CREATED);
    }
    @DeleteMapping("/reset")
    public void  resetStocks(){
        stockService.resetStocks();
    }


}
