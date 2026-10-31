package lesson32;
// ScottishFoldクラスにCatクラスの継承を許可
public sealed class Cat extends Animal permits ScottishFold {
}

// Catクラスで更なる継承を許可されたサブクラス
final class ScottishFold extends Cat {
}
