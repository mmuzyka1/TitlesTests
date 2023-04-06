package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TitleTests extends BaseTest {

    @ParameterizedTest
    @CsvSource({"https://siiportal.sii.pl/, Logowanie na koncie"})
    @DisplayName("Testing SiiPortal title")
    @Tag("Regression")
    void shouldValidateCorrectTitleSiiPortal(String url, String expectedTitle) {
        //GIVEN
        driver.get(url);
        driver.manage().window().maximize();
        //WHEN
        String actualTitle = driver.getTitle();
        //THEN
        assertThat(actualTitle).isEqualTo(expectedTitle);
    }

    @ParameterizedTest
    @CsvSource({"https://www.onet.pl/, Onet – Jesteś na bieżąco"})
    @DisplayName("Testing Onet title")
    @Tag("Regression")
    void shouldValidateCorrectTitleOnet(String url, String expectedTitle) {
        //GIVEN
        driver.get(url);
        driver.manage().window().maximize();
        //WHEN
        String actualTitle = driver.getTitle();
        //THEN
        assertThat(actualTitle).isEqualTo(expectedTitle);
    }
}
