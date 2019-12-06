package m1.team14.model;

import java.util.ArrayList;
import java.util.List;

import dataproto.Dealer;
import m1.team14.Events;

class DealerSelectModel extends AbstractModel {
  private int currentDealerId;

  public void setCurrentDealerId(int id) {
    int oldId = this.currentDealerId;
    this.currentDealerId = id;
    if (oldId != id)  {
      firePropertyChange(Events.DEALER_ID_CHANGE, oldId, id);
    }
  }

  public int getCurrentDealerId() {
    return currentDealerId;
  }
  
  
  
  private static int numOfDealers = 8;
  
  List<Dealer> getDealer(){
  List<Dealer> dealerList = new ArrayList<>();
  for(int i = 0; i < numOfDealers; i++){
   Dealer newDealer = new Dealer();
  
   dealerList.add(newDealer);
  } 
 return (dealerList);
}
}
 
