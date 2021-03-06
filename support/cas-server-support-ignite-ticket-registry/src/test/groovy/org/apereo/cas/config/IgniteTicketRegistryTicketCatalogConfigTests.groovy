package org.apereo.cas.config

import org.apereo.cas.configuration.CasConfigurationProperties
import org.apereo.cas.ticket.TicketCatalogConfigurer

/**
 * @author Dmitriy Kopylenko
 */
class IgniteTicketRegistryTicketCatalogConfigTests extends AbstractCommonCacheBasedStorageNaming {

    @Override
    TicketCatalogConfigurer ticketCatalogConfigurerUnderTest() {
        new IgniteTicketRegistryTicketCatalogConfiguration(casProperties: new CasConfigurationProperties())
    }
}
