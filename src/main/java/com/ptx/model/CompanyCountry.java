package com.ptx.model;

import java.io.Serializable;
import java.util.Date;

public class CompanyCountry implements Serializable {
    private Integer id;

    private String country;

    private String countryCn;

    private String countryEn;

    private String timeZone;

    private String timeZoneLogogram;

    private String amazonZone;

    private String configurationZone;

    private String topLevelDomain;

    private String marketplaceName;

    private String marketplaceId;

    private String fromMarketplaceId;

    private String currencySymbol;

    private String currencyCode;

    private String currency;

    private Byte isEnable;

    private Date createdAt;

    private Date updatedAt;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getCountryCn() {
        return countryCn;
    }

    public void setCountryCn(String countryCn) {
        this.countryCn = countryCn == null ? null : countryCn.trim();
    }

    public String getCountryEn() {
        return countryEn;
    }

    public void setCountryEn(String countryEn) {
        this.countryEn = countryEn == null ? null : countryEn.trim();
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone == null ? null : timeZone.trim();
    }

    public String getTimeZoneLogogram() {
        return timeZoneLogogram;
    }

    public void setTimeZoneLogogram(String timeZoneLogogram) {
        this.timeZoneLogogram = timeZoneLogogram == null ? null : timeZoneLogogram.trim();
    }

    public String getAmazonZone() {
        return amazonZone;
    }

    public void setAmazonZone(String amazonZone) {
        this.amazonZone = amazonZone == null ? null : amazonZone.trim();
    }

    public String getConfigurationZone() {
        return configurationZone;
    }

    public void setConfigurationZone(String configurationZone) {
        this.configurationZone = configurationZone == null ? null : configurationZone.trim();
    }

    public String getTopLevelDomain() {
        return topLevelDomain;
    }

    public void setTopLevelDomain(String topLevelDomain) {
        this.topLevelDomain = topLevelDomain == null ? null : topLevelDomain.trim();
    }

    public String getMarketplaceName() {
        return marketplaceName;
    }

    public void setMarketplaceName(String marketplaceName) {
        this.marketplaceName = marketplaceName == null ? null : marketplaceName.trim();
    }

    public String getMarketplaceId() {
        return marketplaceId;
    }

    public void setMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId == null ? null : marketplaceId.trim();
    }

    public String getFromMarketplaceId() {
        return fromMarketplaceId;
    }

    public void setFromMarketplaceId(String fromMarketplaceId) {
        this.fromMarketplaceId = fromMarketplaceId == null ? null : fromMarketplaceId.trim();
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol == null ? null : currencySymbol.trim();
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode == null ? null : currencyCode.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public Byte getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Byte isEnable) {
        this.isEnable = isEnable;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", country=").append(country);
        sb.append(", countryCn=").append(countryCn);
        sb.append(", countryEn=").append(countryEn);
        sb.append(", timeZone=").append(timeZone);
        sb.append(", timeZoneLogogram=").append(timeZoneLogogram);
        sb.append(", amazonZone=").append(amazonZone);
        sb.append(", configurationZone=").append(configurationZone);
        sb.append(", topLevelDomain=").append(topLevelDomain);
        sb.append(", marketplaceName=").append(marketplaceName);
        sb.append(", marketplaceId=").append(marketplaceId);
        sb.append(", fromMarketplaceId=").append(fromMarketplaceId);
        sb.append(", currencySymbol=").append(currencySymbol);
        sb.append(", currencyCode=").append(currencyCode);
        sb.append(", currency=").append(currency);
        sb.append(", isEnable=").append(isEnable);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}