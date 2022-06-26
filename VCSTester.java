class VCSTester{

public static void main(String a[]){

Git git = new Git();
git.originalAuthor = "Linus Torvalds";
git.type = "Version Control";
git.developers = "Junio Hamano";
git.availableIn = "English";
git.operatingSystem = "Windows,POSIX(Linux, macOS, Solaris,AIX)";

git.toHandleProjects();
System.out.println("Original Author of Git :"+git.originalAuthor+"\n"+"Type :"+git.type+"\n"+"Developers :"+git.developers+"\n"+"Available In :"+git.availableIn+"\n"+"Operating System :"+git.operatingSystem+"\n");

}
}