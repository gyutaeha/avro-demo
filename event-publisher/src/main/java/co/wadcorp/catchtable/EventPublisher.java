package co.wadcorp.catchtable;

import co.wadcorp.catchtable.event.ShopContactChangedEvent;

public class EventPublisher {
  public static void main(String[] args) {
    ShopContactChangedEvent event = ShopContactChangedEvent.newBuilder()
        .setShopId(1)
        .setShopContact("010-****-****")
        .build();
  }
}
