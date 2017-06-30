package gov.samhsa.c2s.c2suiapi.service.dto;

import gov.samhsa.c2s.c2suiapi.infrastructure.dto.BaseUmsLookupDto;
import gov.samhsa.c2s.c2suiapi.infrastructure.dto.IdentifierDto;
import gov.samhsa.c2s.c2suiapi.infrastructure.dto.UmsAddressDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FullProfileResponse {
    private String userLocale;
    private List<BaseUmsLookupDto> supportedLocales;
    private String username;
    private String lastName;
    private String firstName;
    private String middleName;
    private String genderCode;
    private String mrn;
    private LocalDate birthDate;
    private String socialSecurityNumber;
    private UmsAddressDto homeAddress;
    private String homeEmail;
    private String homePhone;
    private List<String> roles;
    private List<IdentifierDto> identifiers;
    private String registrationPurposeEmail;
}
