package tc._467_378_DIV2_250;

public class TwoRotationCypher {

	public String encrypt(int firstSize, int firstRotate, int secondRotate,
			String message) {
		if (firstSize > 25 || firstSize < 1 || firstRotate > firstSize - 1
				|| firstRotate < 0 || secondRotate > 25 - firstSize
				|| secondRotate < 0 || message.length() > 50
				|| message.length() < 1) {
			return "wrong1";
		}		
		char[] mes = message.toLowerCase().toCharArray();
		boolean flag = true;
		String m = "abcdefghijklmnopqrstuvwxyz";
		char[] alphabet = m.toCharArray();
		char[] aClone = alphabet.clone();
		for (int i = 0; i < mes.length; i++) {
			//判断是否含有别的字符，或大写
			Character rs = mes[i];
			if (rs.equals(" ")) {
				//如果是空格则断开此次判断
				break;
			}
			if (!flag && m.contains(rs.toString())) {
				return "wrong2";
			}
		}
		
		for (int j = 0; j < firstSize; j++) {
			if (j + firstRotate < firstSize) {
				aClone[j] = alphabet[j + firstRotate];
			} else {
				aClone[j] = alphabet[j + firstRotate - firstSize];
			}
		}
		
		for (int i = firstSize; i < 26; i++) {
			if (i + secondRotate < 26) {
				aClone[i] = alphabet[i + secondRotate];
			} else {
				aClone[i] = alphabet[i + secondRotate - 26 + firstSize];
			}
		}		

		for (int i = 0; i < mes.length; i++) {
			Character re = mes[i];
			String r = re.toString();
			if (m.contains(r)) {
				int j = m.indexOf(r);
				mes[i] = aClone[j];
			}
		}
		String mm = new String(mes);
		message = mm;
		return message;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoRotationCypher twoRot = new TwoRotationCypher();
		System.out.println(twoRot.encrypt(13, 0, 0,
				"this string will not change at all"));

	}

}
