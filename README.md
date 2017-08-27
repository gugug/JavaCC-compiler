# 基于JavaCC的Python编译器
## javacc生成的源程序包含：
* Parser.java（语法分析器）、
* TokenManager.java（词法分析器）、
* TokenMgrError.java（错误处理程序）、
* Token. java （标记信息）、
* Constants.java （分析器中使用的常量）、
* SimpleCharStream.java （字符流类）等源文件。
## JavaCC词法分析器
TokenManager：词法分析器类，该类可以将字符串解析为一个一个的标识符(Token)， 并且可以把这些标识符归类。
## JavaCC语法分析器
默认采用LL(1)文法分析

### LL(1) 文法
预测分析表(2维数组中, 行: 非终结符, 列: 终结符), 使用哪个候选式来进行替换. 必须是无二义性的文法,只是一个上下文无关文法的子集  
LL1文法分析过程：
1. 消除左递归
2. 提取公共左因子
3. 求First集和Follow集
4. 基于First集和Follow集构建预测分析表
