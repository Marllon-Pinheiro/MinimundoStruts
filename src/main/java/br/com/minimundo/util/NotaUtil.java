package br.com.minimundo.util;

import java.math.BigDecimal;
import java.util.List;

import br.com.minimundo.enums.TipoProvaEnum;
import br.com.minimundo.model.Prova;

public class NotaUtil {
	
	public static BigDecimal pegarNotaTotal(List<Prova> provas) {
		BigDecimal notaTotal = new BigDecimal(0);
		for (Prova prova : provas) {
			if (prova.getTipo() == TipoProvaEnum.PROVA1
					|| prova.getTipo() == TipoProvaEnum.PROVA2
					|| prova.getTipo() == TipoProvaEnum.PROVA3
					|| prova.getTipo() == TipoProvaEnum.PROVAFINAL) {
				notaTotal = notaTotal.add(prova.getNota());
			}
			if (prova.getTipo() == TipoProvaEnum.PROVAESPECIAL) {
				notaTotal = notaTotal.add(prova.getNota().multiply(new BigDecimal(2)));
				notaTotal = notaTotal.divide(new BigDecimal(5), 2,
						BigDecimal.ROUND_HALF_EVEN);
			}
		}
		return notaTotal;
	}

}
