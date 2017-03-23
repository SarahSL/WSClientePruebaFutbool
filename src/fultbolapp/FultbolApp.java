package fultbolapp;

import eu.dataaccess.footballpool.ArrayOftCardInfo;

public class FultbolApp {
    public static void main(String[] args) {
        ArrayOftCardInfo aux = FultbolApp.allCards();

        System.out.println(FultbolApp.yellowCardsTotal());
        
        
    }

    private static ArrayOftCardInfo allCards() {
        eu.dataaccess.footballpool.Info service = new eu.dataaccess.footballpool.Info();
        eu.dataaccess.footballpool.InfoSoapType port = service.getInfoSoap12();
        return port.allCards();
    }

    private static int yellowCardsTotal() {
        eu.dataaccess.footballpool.Info service = new eu.dataaccess.footballpool.Info();
        eu.dataaccess.footballpool.InfoSoapType port = service.getInfoSoap();
        return port.yellowCardsTotal();
    }
    
}
