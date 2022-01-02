package com.api.modelResponse.Payment;

import java.util.List;

public class Transaction {
	private String id;
	private String status;
	private String type;
	private String currencyIsoCode;
	private String amount;
	private String merchantAccountId;
	private Object subMerchantAccountId;
	private Object masterMerchantAccountId;
	private Object orderId;
	private String createdAt;
	private String updatedAt;
	private Customer customer;
	private Billing billing;
	private Object refundId;
	private List<Object> refundIds = null;
	private Object refundedTransactionId;
	private List<Object> partialSettlementTransactionIds = null;
	private Object authorizedTransactionId;
	private Object settlementBatchId;
	private Shipping shipping;
	private String customFields;
	private Object avsErrorResponseCode;
	private String avsPostalCodeResponseCode;
	private String avsStreetAddressResponseCode;
	private String cvvResponseCode;
	private Object gatewayRejectionReason;
	private String processorAuthorizationCode;
	private String processorResponseCode;
	private String processorResponseText;
	private Object additionalProcessorResponse;
	private Object voiceReferralNumber;
	private Object purchaseOrderNumber;
	private Object taxAmount;
	private Boolean taxExempt;
	private Object scaExemptionRequested;
	private Boolean processedWithNetworkToken;
	private CreditCard creditCard;
	private List<StatusHistory> statusHistory = null;
	private String planId;
	private String subscriptionId;
	private Subscription_ subscription;
	private List<Object> addOns = null;
	private List<Object> discounts = null;
	private Descriptor_ descriptor;
	private Boolean recurring;
	private Object channel;
	private Object serviceFeeAmount;
	private Object escrowStatus;
	private DisbursementDetails disbursementDetails;
	private List<Object> disputes = null;
	private List<Object> authorizationAdjustments = null;
	private String paymentInstrumentType;
	private String processorSettlementResponseCode;
	private String processorSettlementResponseText;
	private String networkResponseCode;
	private String networkResponseText;
	private Object threeDSecureInfo;
	private Object shipsFromPostalCode;
	private Object shippingAmount;
	private Object discountAmount;
	private String networkTransactionId;
	private String processorResponseType;
	private String authorizationExpiresAt;
	private List<Object> retryIds = null;
	private Object retriedTransactionId;
	private List<Object> refundGlobalIds = null;
	private List<Object> partialSettlementTransactionGlobalIds = null;
	private Object refundedTransactionGlobalId;
	private Object authorizedTransactionGlobalId;
	private String globalId;
	private String graphQLId;
	private List<Object> retryGlobalIds = null;
	private Object retriedTransactionGlobalId;
	private String retrievalReferenceNumber;
	private Object installmentCount;
	private List<Object> installments = null;
	private List<Object> refundedInstallments = null;
	private Object responseEmvData;
	private Object acquirerReferenceNumber;
	private String merchantIdentificationNumber;
	private String terminalIdentificationNumber;
	private String merchantName;
	private MerchantAddress merchantAddress;
	private Boolean pinVerified;
	private PaypalAccount paypalAccount;
	private PaypalHereDetails paypalHereDetails;
	private LocalPayment localPayment;
	private ApplePayCard applePayCard;
	private AndroidPayCard androidPayCard;
	private VisaCheckoutCard visaCheckoutCard;
	private SamsungPayCard samsungPayCard;

	public String getId() {
	return id;
	}

	public void setId(String id) {
	this.id = id;
	}

	public String getStatus() {
	return status;
	}

	public void setStatus(String status) {
	this.status = status;
	}

	public String getType() {
	return type;
	}

	public void setType(String type) {
	this.type = type;
	}

	public String getCurrencyIsoCode() {
	return currencyIsoCode;
	}

	public void setCurrencyIsoCode(String currencyIsoCode) {
	this.currencyIsoCode = currencyIsoCode;
	}

	public String getAmount() {
	return amount;
	}

	public void setAmount(String amount) {
	this.amount = amount;
	}

	public String getMerchantAccountId() {
	return merchantAccountId;
	}

	public void setMerchantAccountId(String merchantAccountId) {
	this.merchantAccountId = merchantAccountId;
	}

	public Object getSubMerchantAccountId() {
	return subMerchantAccountId;
	}

	public void setSubMerchantAccountId(Object subMerchantAccountId) {
	this.subMerchantAccountId = subMerchantAccountId;
	}

	public Object getMasterMerchantAccountId() {
	return masterMerchantAccountId;
	}

	public void setMasterMerchantAccountId(Object masterMerchantAccountId) {
	this.masterMerchantAccountId = masterMerchantAccountId;
	}

	public Object getOrderId() {
	return orderId;
	}

	public void setOrderId(Object orderId) {
	this.orderId = orderId;
	}

	public String getCreatedAt() {
	return createdAt;
	}

	public void setCreatedAt(String createdAt) {
	this.createdAt = createdAt;
	}

	public String getUpdatedAt() {
	return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
	this.updatedAt = updatedAt;
	}

	public Customer getCustomer() {
	return customer;
	}

	public void setCustomer(Customer customer) {
	this.customer = customer;
	}

	public Billing getBilling() {
	return billing;
	}

	public void setBilling(Billing billing) {
	this.billing = billing;
	}

	public Object getRefundId() {
	return refundId;
	}

	public void setRefundId(Object refundId) {
	this.refundId = refundId;
	}

	public List<Object> getRefundIds() {
	return refundIds;
	}

	public void setRefundIds(List<Object> refundIds) {
	this.refundIds = refundIds;
	}

	public Object getRefundedTransactionId() {
	return refundedTransactionId;
	}

	public void setRefundedTransactionId(Object refundedTransactionId) {
	this.refundedTransactionId = refundedTransactionId;
	}

	public List<Object> getPartialSettlementTransactionIds() {
	return partialSettlementTransactionIds;
	}

	public void setPartialSettlementTransactionIds(List<Object> partialSettlementTransactionIds) {
	this.partialSettlementTransactionIds = partialSettlementTransactionIds;
	}

	public Object getAuthorizedTransactionId() {
	return authorizedTransactionId;
	}

	public void setAuthorizedTransactionId(Object authorizedTransactionId) {
	this.authorizedTransactionId = authorizedTransactionId;
	}

	public Object getSettlementBatchId() {
	return settlementBatchId;
	}

	public void setSettlementBatchId(Object settlementBatchId) {
	this.settlementBatchId = settlementBatchId;
	}

	public Shipping getShipping() {
	return shipping;
	}

	public void setShipping(Shipping shipping) {
	this.shipping = shipping;
	}

	public String getCustomFields() {
	return customFields;
	}

	public void setCustomFields(String customFields) {
	this.customFields = customFields;
	}

	public Object getAvsErrorResponseCode() {
	return avsErrorResponseCode;
	}

	public void setAvsErrorResponseCode(Object avsErrorResponseCode) {
	this.avsErrorResponseCode = avsErrorResponseCode;
	}

	public String getAvsPostalCodeResponseCode() {
	return avsPostalCodeResponseCode;
	}

	public void setAvsPostalCodeResponseCode(String avsPostalCodeResponseCode) {
	this.avsPostalCodeResponseCode = avsPostalCodeResponseCode;
	}

	public String getAvsStreetAddressResponseCode() {
	return avsStreetAddressResponseCode;
	}

	public void setAvsStreetAddressResponseCode(String avsStreetAddressResponseCode) {
	this.avsStreetAddressResponseCode = avsStreetAddressResponseCode;
	}

	public String getCvvResponseCode() {
	return cvvResponseCode;
	}

	public void setCvvResponseCode(String cvvResponseCode) {
	this.cvvResponseCode = cvvResponseCode;
	}

	public Object getGatewayRejectionReason() {
	return gatewayRejectionReason;
	}

	public void setGatewayRejectionReason(Object gatewayRejectionReason) {
	this.gatewayRejectionReason = gatewayRejectionReason;
	}

	public String getProcessorAuthorizationCode() {
	return processorAuthorizationCode;
	}

	public void setProcessorAuthorizationCode(String processorAuthorizationCode) {
	this.processorAuthorizationCode = processorAuthorizationCode;
	}

	public String getProcessorResponseCode() {
	return processorResponseCode;
	}

	public void setProcessorResponseCode(String processorResponseCode) {
	this.processorResponseCode = processorResponseCode;
	}

	public String getProcessorResponseText() {
	return processorResponseText;
	}

	public void setProcessorResponseText(String processorResponseText) {
	this.processorResponseText = processorResponseText;
	}

	public Object getAdditionalProcessorResponse() {
	return additionalProcessorResponse;
	}

	public void setAdditionalProcessorResponse(Object additionalProcessorResponse) {
	this.additionalProcessorResponse = additionalProcessorResponse;
	}

	public Object getVoiceReferralNumber() {
	return voiceReferralNumber;
	}

	public void setVoiceReferralNumber(Object voiceReferralNumber) {
	this.voiceReferralNumber = voiceReferralNumber;
	}

	public Object getPurchaseOrderNumber() {
	return purchaseOrderNumber;
	}

	public void setPurchaseOrderNumber(Object purchaseOrderNumber) {
	this.purchaseOrderNumber = purchaseOrderNumber;
	}

	public Object getTaxAmount() {
	return taxAmount;
	}

	public void setTaxAmount(Object taxAmount) {
	this.taxAmount = taxAmount;
	}

	public Boolean getTaxExempt() {
	return taxExempt;
	}

	public void setTaxExempt(Boolean taxExempt) {
	this.taxExempt = taxExempt;
	}

	public Object getScaExemptionRequested() {
	return scaExemptionRequested;
	}

	public void setScaExemptionRequested(Object scaExemptionRequested) {
	this.scaExemptionRequested = scaExemptionRequested;
	}

	public Boolean getProcessedWithNetworkToken() {
	return processedWithNetworkToken;
	}

	public void setProcessedWithNetworkToken(Boolean processedWithNetworkToken) {
	this.processedWithNetworkToken = processedWithNetworkToken;
	}

	public CreditCard getCreditCard() {
	return creditCard;
	}

	public void setCreditCard(CreditCard creditCard) {
	this.creditCard = creditCard;
	}

	public List<StatusHistory> getStatusHistory() {
	return statusHistory;
	}

	public void setStatusHistory(List<StatusHistory> statusHistory) {
	this.statusHistory = statusHistory;
	}

	public String getPlanId() {
	return planId;
	}

	public void setPlanId(String planId) {
	this.planId = planId;
	}

	public String getSubscriptionId() {
	return subscriptionId;
	}

	public void setSubscriptionId(String subscriptionId) {
	this.subscriptionId = subscriptionId;
	}

	public Subscription_ getSubscription() {
	return subscription;
	}

	public void setSubscription(Subscription_ subscription) {
	this.subscription = subscription;
	}

	public List<Object> getAddOns() {
	return addOns;
	}

	public void setAddOns(List<Object> addOns) {
	this.addOns = addOns;
	}

	public List<Object> getDiscounts() {
	return discounts;
	}

	public void setDiscounts(List<Object> discounts) {
	this.discounts = discounts;
	}

	public Descriptor_ getDescriptor() {
	return descriptor;
	}

	public void setDescriptor(Descriptor_ descriptor) {
	this.descriptor = descriptor;
	}

	public Boolean getRecurring() {
	return recurring;
	}

	public void setRecurring(Boolean recurring) {
	this.recurring = recurring;
	}

	public Object getChannel() {
	return channel;
	}

	public void setChannel(Object channel) {
	this.channel = channel;
	}

	public Object getServiceFeeAmount() {
	return serviceFeeAmount;
	}

	public void setServiceFeeAmount(Object serviceFeeAmount) {
	this.serviceFeeAmount = serviceFeeAmount;
	}

	public Object getEscrowStatus() {
	return escrowStatus;
	}

	public void setEscrowStatus(Object escrowStatus) {
	this.escrowStatus = escrowStatus;
	}

	public DisbursementDetails getDisbursementDetails() {
	return disbursementDetails;
	}

	public void setDisbursementDetails(DisbursementDetails disbursementDetails) {
	this.disbursementDetails = disbursementDetails;
	}

	public List<Object> getDisputes() {
	return disputes;
	}

	public void setDisputes(List<Object> disputes) {
	this.disputes = disputes;
	}

	public List<Object> getAuthorizationAdjustments() {
	return authorizationAdjustments;
	}

	public void setAuthorizationAdjustments(List<Object> authorizationAdjustments) {
	this.authorizationAdjustments = authorizationAdjustments;
	}

	public String getPaymentInstrumentType() {
	return paymentInstrumentType;
	}

	public void setPaymentInstrumentType(String paymentInstrumentType) {
	this.paymentInstrumentType = paymentInstrumentType;
	}

	public String getProcessorSettlementResponseCode() {
	return processorSettlementResponseCode;
	}

	public void setProcessorSettlementResponseCode(String processorSettlementResponseCode) {
	this.processorSettlementResponseCode = processorSettlementResponseCode;
	}

	public String getProcessorSettlementResponseText() {
	return processorSettlementResponseText;
	}

	public void setProcessorSettlementResponseText(String processorSettlementResponseText) {
	this.processorSettlementResponseText = processorSettlementResponseText;
	}

	public String getNetworkResponseCode() {
	return networkResponseCode;
	}

	public void setNetworkResponseCode(String networkResponseCode) {
	this.networkResponseCode = networkResponseCode;
	}

	public String getNetworkResponseText() {
	return networkResponseText;
	}

	public void setNetworkResponseText(String networkResponseText) {
	this.networkResponseText = networkResponseText;
	}

	public Object getThreeDSecureInfo() {
	return threeDSecureInfo;
	}

	public void setThreeDSecureInfo(Object threeDSecureInfo) {
	this.threeDSecureInfo = threeDSecureInfo;
	}

	public Object getShipsFromPostalCode() {
	return shipsFromPostalCode;
	}

	public void setShipsFromPostalCode(Object shipsFromPostalCode) {
	this.shipsFromPostalCode = shipsFromPostalCode;
	}

	public Object getShippingAmount() {
	return shippingAmount;
	}

	public void setShippingAmount(Object shippingAmount) {
	this.shippingAmount = shippingAmount;
	}

	public Object getDiscountAmount() {
	return discountAmount;
	}

	public void setDiscountAmount(Object discountAmount) {
	this.discountAmount = discountAmount;
	}

	public String getNetworkTransactionId() {
	return networkTransactionId;
	}

	public void setNetworkTransactionId(String networkTransactionId) {
	this.networkTransactionId = networkTransactionId;
	}

	public String getProcessorResponseType() {
	return processorResponseType;
	}

	public void setProcessorResponseType(String processorResponseType) {
	this.processorResponseType = processorResponseType;
	}

	public String getAuthorizationExpiresAt() {
	return authorizationExpiresAt;
	}

	public void setAuthorizationExpiresAt(String authorizationExpiresAt) {
	this.authorizationExpiresAt = authorizationExpiresAt;
	}

	public List<Object> getRetryIds() {
	return retryIds;
	}

	public void setRetryIds(List<Object> retryIds) {
	this.retryIds = retryIds;
	}

	public Object getRetriedTransactionId() {
	return retriedTransactionId;
	}

	public void setRetriedTransactionId(Object retriedTransactionId) {
	this.retriedTransactionId = retriedTransactionId;
	}

	public List<Object> getRefundGlobalIds() {
	return refundGlobalIds;
	}

	public void setRefundGlobalIds(List<Object> refundGlobalIds) {
	this.refundGlobalIds = refundGlobalIds;
	}

	public List<Object> getPartialSettlementTransactionGlobalIds() {
	return partialSettlementTransactionGlobalIds;
	}

	public void setPartialSettlementTransactionGlobalIds(List<Object> partialSettlementTransactionGlobalIds) {
	this.partialSettlementTransactionGlobalIds = partialSettlementTransactionGlobalIds;
	}

	public Object getRefundedTransactionGlobalId() {
	return refundedTransactionGlobalId;
	}

	public void setRefundedTransactionGlobalId(Object refundedTransactionGlobalId) {
	this.refundedTransactionGlobalId = refundedTransactionGlobalId;
	}

	public Object getAuthorizedTransactionGlobalId() {
	return authorizedTransactionGlobalId;
	}

	public void setAuthorizedTransactionGlobalId(Object authorizedTransactionGlobalId) {
	this.authorizedTransactionGlobalId = authorizedTransactionGlobalId;
	}

	public String getGlobalId() {
	return globalId;
	}

	public void setGlobalId(String globalId) {
	this.globalId = globalId;
	}

	public String getGraphQLId() {
	return graphQLId;
	}

	public void setGraphQLId(String graphQLId) {
	this.graphQLId = graphQLId;
	}

	public List<Object> getRetryGlobalIds() {
	return retryGlobalIds;
	}

	public void setRetryGlobalIds(List<Object> retryGlobalIds) {
	this.retryGlobalIds = retryGlobalIds;
	}

	public Object getRetriedTransactionGlobalId() {
	return retriedTransactionGlobalId;
	}

	public void setRetriedTransactionGlobalId(Object retriedTransactionGlobalId) {
	this.retriedTransactionGlobalId = retriedTransactionGlobalId;
	}

	public String getRetrievalReferenceNumber() {
	return retrievalReferenceNumber;
	}

	public void setRetrievalReferenceNumber(String retrievalReferenceNumber) {
	this.retrievalReferenceNumber = retrievalReferenceNumber;
	}

	public Object getInstallmentCount() {
	return installmentCount;
	}

	public void setInstallmentCount(Object installmentCount) {
	this.installmentCount = installmentCount;
	}

	public List<Object> getInstallments() {
	return installments;
	}

	public void setInstallments(List<Object> installments) {
	this.installments = installments;
	}

	public List<Object> getRefundedInstallments() {
	return refundedInstallments;
	}

	public void setRefundedInstallments(List<Object> refundedInstallments) {
	this.refundedInstallments = refundedInstallments;
	}

	public Object getResponseEmvData() {
	return responseEmvData;
	}

	public void setResponseEmvData(Object responseEmvData) {
	this.responseEmvData = responseEmvData;
	}

	public Object getAcquirerReferenceNumber() {
	return acquirerReferenceNumber;
	}

	public void setAcquirerReferenceNumber(Object acquirerReferenceNumber) {
	this.acquirerReferenceNumber = acquirerReferenceNumber;
	}

	public String getMerchantIdentificationNumber() {
	return merchantIdentificationNumber;
	}

	public void setMerchantIdentificationNumber(String merchantIdentificationNumber) {
	this.merchantIdentificationNumber = merchantIdentificationNumber;
	}

	public String getTerminalIdentificationNumber() {
	return terminalIdentificationNumber;
	}

	public void setTerminalIdentificationNumber(String terminalIdentificationNumber) {
	this.terminalIdentificationNumber = terminalIdentificationNumber;
	}

	public String getMerchantName() {
	return merchantName;
	}

	public void setMerchantName(String merchantName) {
	this.merchantName = merchantName;
	}

	public MerchantAddress getMerchantAddress() {
	return merchantAddress;
	}

	public void setMerchantAddress(MerchantAddress merchantAddress) {
	this.merchantAddress = merchantAddress;
	}

	public Boolean getPinVerified() {
	return pinVerified;
	}

	public void setPinVerified(Boolean pinVerified) {
	this.pinVerified = pinVerified;
	}

	public PaypalAccount getPaypalAccount() {
	return paypalAccount;
	}

	public void setPaypalAccount(PaypalAccount paypalAccount) {
	this.paypalAccount = paypalAccount;
	}

	public PaypalHereDetails getPaypalHereDetails() {
	return paypalHereDetails;
	}

	public void setPaypalHereDetails(PaypalHereDetails paypalHereDetails) {
	this.paypalHereDetails = paypalHereDetails;
	}

	public LocalPayment getLocalPayment() {
	return localPayment;
	}

	public void setLocalPayment(LocalPayment localPayment) {
	this.localPayment = localPayment;
	}

	public ApplePayCard getApplePayCard() {
	return applePayCard;
	}

	public void setApplePayCard(ApplePayCard applePayCard) {
	this.applePayCard = applePayCard;
	}

	public AndroidPayCard getAndroidPayCard() {
	return androidPayCard;
	}

	public void setAndroidPayCard(AndroidPayCard androidPayCard) {
	this.androidPayCard = androidPayCard;
	}

	public VisaCheckoutCard getVisaCheckoutCard() {
	return visaCheckoutCard;
	}

	public void setVisaCheckoutCard(VisaCheckoutCard visaCheckoutCard) {
	this.visaCheckoutCard = visaCheckoutCard;
	}

	public SamsungPayCard getSamsungPayCard() {
	return samsungPayCard;
	}

	public void setSamsungPayCard(SamsungPayCard samsungPayCard) {
	this.samsungPayCard = samsungPayCard;
	}
}
