package com.zeluciojr.enrollments.core.use_cases.create_new_enrollment.io.inputs;

import com.cae.use_cases.io.UseCaseInput;
import com.cae.use_cases.io.annotations.NotBlankInputField;
import com.cae.use_cases.io.annotations.NotNullInputField;
import lombok.*;

/**
 * This class maps the input fields for your use case. Before executing the use case,
 * the internal method UseCaseInput::validateProperties will be called to ensure each
 * field complies with its requirements.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateNewEnrollmentUseCaseInput extends UseCaseInput {

    @NotNullInputField
    @NotBlankInputField
    private String personId;

    @NotNullInputField
    @NotBlankInputField
    private String roleId;

}
