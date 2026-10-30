package headFirstJava;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PoaType {

    BANK("Банковская"),
    BANK_A_CLUB("Аклубовская"),
    NOTAR_REZ("Нотариальная"),
    NPTAR_NEREZ("Нотариальная иностранная");

    private final String poaType;
}
