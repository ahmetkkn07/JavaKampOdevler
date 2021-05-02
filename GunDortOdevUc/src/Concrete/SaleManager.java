package Concrete;

import Abstract.Logger;
import Abstract.SaleService;
import Entities.Sale;

public class SaleManager implements SaleService {

    @Override
    public void add(Sale sale, Logger logger) {
        System.out.println("Toplam tutar: " + sale.getTotalPrice() + " TL");
        logger.log(sale.getPlayer().getFirstName() + " isimli kullanıcıya satış yapıldı.");
    }
}
