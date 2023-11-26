package Stock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService {
    private final UserRepo userRepo;
    @Autowired
    public StockService(UserRepo userRepo){
        this.userRepo = userRepo;
    }
    public List<Stock> getStocks(){
        return userRepo.findAll();
    }
    public Stock addStock( Stock stock){
         return userRepo.save(stock);
    }
    public void deleteStock(String symbol){
    }
    public void resetStocks(){
        userRepo.deleteAll();
    }

}
