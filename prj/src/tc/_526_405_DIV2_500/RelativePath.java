package tc._526_405_DIV2_500;

public class RelativePath {

	/**
	 * @param args
	 */
	public String makeRelative(String path, String currentDir) {
		String newPath = "";
		String[] pathItems = path.split("/");
		String[] currDirItems = currentDir.split("/");
		if (currDirItems.length == 0) {
			for (int l = 0; l < pathItems.length; l++) {
				newPath += pathItems[l];
				if (l > 0 && l != pathItems.length - 1)
					newPath += "/";
			}
			return newPath;
		}
		for (int i = 0; i < pathItems.length; i++) {
			if (pathItems[i].equalsIgnoreCase(currDirItems[i])) {
				if (currDirItems.length == i + 1
						&& currDirItems.length < pathItems.length) {
					for (int m = 1; m < pathItems.length - i; m++) {
						newPath += pathItems[i + m];
						if (i + m + 1 != pathItems.length)
							newPath += "/";
					}
					return newPath;
				}
				if (i == pathItems.length - 1
						&& currDirItems.length > pathItems.length) {
					for (int n = 1; n < currDirItems.length - i; n++) {
						newPath += "..";
						if (n != currDirItems.length - i - 1)
							newPath += "/";
					}
					return newPath;
				}
				continue;
			}
			for (int j = 0; j < currDirItems.length - i; j++) {
				newPath += "..";
				if (j != currDirItems.length - i - 1)
					newPath += "/";
			}
			for (int k = 0; k < pathItems.length - i; k++)
				newPath += "/" + pathItems[i + k];
			return newPath;
		}
		return newPath;
	}

	public String makeRelative2(String path, String currentDir) {
		String relativePath="";
		String rootPath="/";
		String sufixPath="";
		String[] pathItems = path.split("/");
		String[] currDirItems = currentDir.split("/");
		int i=0;
		int n=0;
		int m=0;
		for(;i<pathItems.length;i++){
			if(i<currDirItems.length-1){
				if(pathItems[i].equals(currDirItems[i])){
					rootPath+= pathItems[i]+"/";
				}
			}else{
				if(n==0){
					n=i;
					break;
				}
			}
		}

		relativePath+=sufixPath;
		return relativePath;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RelativePath r = new RelativePath();
		System.out.println(r.makeRelative("/home/top/data/file",
				"/home/user/pictures"));
		System.out.println(r.makeRelative("/home/user/movies/title",
				"/home/user/pictures"));//
		System.out.println(r.makeRelative("/file", "/"));
		System.out.println(r.makeRelative("/a/b/a/b/a/b", "/a/b/a/a/b/a/b"));
		System.out.println(r.makeRelative("/root/root/root", "/root"));
		System.out.println(r.makeRelative(
				"/b/b/b/a/a/a/b/b/a/a/b/b/b/b/a/b/a/a/b/a/a/b/a",
				"/b/b/b/a/a/a/b/b/a/a/b/b/b/b/a/b/a/a/b"));
		
		System.out.println(r.makeRelative2("/home/top/data/file",
				"/home/user/pictures"));
		System.out.println(r.makeRelative2("/home/user/movies/title",
				"/home/user/pictures"));//
		System.out.println(r.makeRelative2("/file", "/"));
		System.out.println(r.makeRelative2("/a/b/a/b/a/b", "/a/b/a/a/b/a/b"));
//		System.out.println(r.makeRelative2("/root/root/root", "/root"));
//		System.out.println(r.makeRelative2(
//				"/b/b/b/a/a/a/b/b/a/a/b/b/b/b/a/b/a/a/b/a/a/b/a",
//				"/b/b/b/a/a/a/b/b/a/a/b/b/b/b/a/b/a/a/b"));
		

	}

}
