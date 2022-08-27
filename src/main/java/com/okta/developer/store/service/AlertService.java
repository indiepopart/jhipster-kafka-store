package com.okta.developer.store.service;

import com.okta.developer.store.config.KafkaStoreAlertProducer;
import com.okta.developer.store.domain.Store;
import com.okta.developer.store.service.dto.StoreAlertDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;

@Service
public class AlertService {

    private final Logger log = LoggerFactory.getLogger(AlertService.class);

    @SendTo(KafkaStoreAlertProducer.CHANNELNAME)
    public StoreAlertDTO alertStoreStatus(Store store) {
        StoreAlertDTO storeAlertDTO = new StoreAlertDTO(store);
        log.debug("Request the message : {} to send to store-alert topic ", storeAlertDTO);
        return storeAlertDTO;
    }
}
