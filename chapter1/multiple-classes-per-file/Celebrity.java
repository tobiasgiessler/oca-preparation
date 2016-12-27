// only one public class is allowed per file
public class Celebrity {}
// an arbitrary amount of classes with default access (package private) can
// exist in the same file
class Chauffeur {}
class Reporter {
  // private classes can only exist within other classes
  private class Camera {}
}
