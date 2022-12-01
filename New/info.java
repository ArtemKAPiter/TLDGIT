package com.bears.webPage.webControllers.games;

import com.bears.webPage.domain.towerOfMagic.ResponseTower;
import com.bears.webPage.domain.towerOfMagic.TowerShop;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TowerOfMagicRESTController {
    
    @RequestMapping(value = "/TowerOfMagic/purchase", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Object AddEvent(@RequestParam(name="notification_type") String notification_type1) {

        System.out.println(notification_type1);

        TowerShop towerShop = new TowerShop();

        ResponseTower responseTower = new ResponseTower();
        responseTower.setTitle("600 изумрудов");
        responseTower.setPrice(600);
        responseTower.setPhoto_url("https://bearscomgames.com/games/BinaryCorgi/images/for_repost.png");
        responseTower.setDiscount(8);
        responseTower.setItem_id("sale_item_1");
        responseTower.setExpiration(3600);

        towerShop.setResponse(responseTower);

        return towerShop;
    }
}