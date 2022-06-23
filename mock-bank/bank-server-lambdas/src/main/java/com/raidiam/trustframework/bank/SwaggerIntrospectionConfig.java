package com.raidiam.trustframework.bank;

import com.raidiam.trustframework.mockbank.models.generated.*;
import io.micronaut.core.annotation.Introspected;
import org.hibernate.envers.DefaultRevisionEntity;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Map;

@Introspected(classes = {
        BusinessEntity.class,
        BusinessEntityDocument.class,
        CreateConsent.class,
        CreateConsentData.class,
        Links.class,
        LoggedUser.class,
        LoggedUserDocument.class,
        Meta.class,
        ResponseConsent.class,
        ResponseConsentFull.class,
        ResponseConsentData.class,
        ResponseConsentFullData.class,
        ResponseError.class,
        ResponseErrorErrors.class,
        OffsetDateTime.class,
        UpdateConsent.class,
        UpdateConsentData.class,
        String.class,
        DefaultRevisionEntity.class,
        Map.class,
        CreatePixPayment.class,
        CreatePixPaymentData.class,
        EnumLocalInstrument.class,
        PaymentPix.class,
        CreditorAccount.class,
        EnumAccountPaymentsType.class,
        UpdatePixPayment.class,
        UpdatePixPaymentData.class,
        EnumPaymentStatusType.class,
        CreatePaymentConsent.class,
        CreatePaymentConsentData.class,
        Identification.class,
        PaymentConsent.class,
        DebtorAccount.class,
        UpdatePaymentConsent.class,
        UpdatePaymentConsentData.class,
        PatchPaymentsConsent.class,
        LocalDate.class,
        Schedule.class,
        Single.class,
})
public class SwaggerIntrospectionConfig {
}
