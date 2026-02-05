package com.provisa.consts;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public enum CITY {

    BIALYSTOK("Białystok"),
    BIELSKO_BIALA("Bielsko-Biała"),
    BYDGOSZCZ("Bydgoszcz"),
    CZESTOCHOWA("Częstochowa"),
    ELBLAG("Elbląg"),
    GORZOW_WIELKOPOLSKI("Gorzów Wielkopolski"),
    INOWROCLAW("Inowrocław"),
    KALISZ("Kalisz"),
    KATOWICE_GLIWICE_TYCHY("Katowice - Gliwice - Tychy"),
    KIELCE("Kielce"),
    KLOBUCK("Kłobuck"),
    KONIN("Konin"),
    KOSTRZYN_NAD_ODRA("Kostrzyn nad Odrą"),
    KRAKOW("Kraków"),
    LODZ("Łódź"),
    LOMZA("Łomża"),
    LUBLIN("Lublin"),
    LUBLINIEC("Lubliniec"),
    MIELEC("Mielec"),
    NOWA_SOL("Nowa Sól"),
    NOWY_SACZ("Nowy Sącz"),
    OLSZTYN("Olsztyn"),
    OPOLE("Opole"),
    POZNAN("Poznań"),
    RZESZOW("Rzeszów"),
    SZCZECIN("Szczecin"),
    TORUN("Toruń"),
    TROJMIASTO("Trójmiasto"),
    WALBRZYCH("Wałbrzych"),
    WARSZAWA("Warszawa"),
    WROCLAW("Wrocław"),
    PHONE("Phone"),
    UNDEFINED("Undefined");

    private final String cityName;

    CITY(String cityName) {
        this.cityName = cityName;
    }

    public static List<CITY> getCities(List<String> cities) {
        if (cities == null) return new ArrayList<>();
        return cities.stream()
                .map(city -> java.util.Arrays.stream(CITY.values())
                        .filter(enumCity -> enumCity.getCityName().equalsIgnoreCase(city) || enumCity.name().equalsIgnoreCase(city))
                        .findFirst().orElse(null))
                .filter(java.util.Objects::nonNull)
                .collect(java.util.stream.Collectors.toList());
    }

    public Integer getId() {
        return this.ordinal();
    }

    @Override
    public String toString() {
        return cityName;
    }

    public String getName() {
        return this.name();
    }

}