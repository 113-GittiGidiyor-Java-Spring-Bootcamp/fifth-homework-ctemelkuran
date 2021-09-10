package dev.patika.schoolmanagementhw05.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InstructorDTO {
    @ApiModelProperty(hidden = true)
    private long id;

    @ApiModelProperty(example = "Ford Prefect")
    @NotBlank(message = "Instructor name is mandatory")
    private String name;

    @ApiModelProperty(example = "Bostanli, Izmir")
    private String address;

    @ApiModelProperty(example = "05381234556")
    @NotNull(message = "Phone Number is is mandatory")
    private String phoneNumber;


}
