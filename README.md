# Wuliu-STN

五柳速记(Wuliu Simple Text Note) is a simple note keeper.

## 特点

- 使用 Java 标准库，完全没有第三方代码
- 开发时不用 Maven, Gradle 之类，只使用 `javac`
- 有一个简单的 GUI 窗口
- 代码极致简单，不可能更简单了（约 100 行代码）

## 安装方法

0. 如果你的电脑里没有 JDK (Java Development Kit), 则需要先安装 JDK  
   安装方法详见 <https://dev.java/learn/getting-started/#setting-up-jdk>
1. 项目地址 <https://github.com/ahui2016/Wuliu-STN>  
   使用 git clone 或直接下载源码 zip
2. 下载源码后，不需要安装即可使用（如果是 zip 则需要解压缩）

## 使用方法

- 在 Windows 中建议使用 Windows Terminal 和 Powershell
- 源码中已经有一个脚本文件 `newnote.ps1`  
  (该脚本文件的内容是 `java wuliu_stn.create_note_gui.Main`)  
  (如果使用 Linux 或 Mac, 直接把文件名改为 `newnote.sh` 即可，不需要修改其内容)
- 使用终端命令行，进入源码文件夹，执行命令 `newnote.ps1` (或 `newnote.sh`)  
  即可启动程序，在文本框输入内容，点击 OK 按钮，就记录了一条内容。
- 笔记内容全部保存在当前目录的 `all_notes` 文件夹内，每天一个文件。
- `all_notes` 文件夹内的文件，你可以随意编辑，它们只是普通的文本文件而已。

### 使用技巧

在 Windows 中，可以使用命令 `start all_notes` 打开笔记文件夹。  
或者使用命令 `start all_notes/2025-01-01.txt` 直接打开某一天的笔记。

### 标签

- 笔记格式是纯文本，不支持 Markdown
- 笔记内容可使用 `#标签#` 的格式添加标签，例如 `#Java#`, `#编程#`
- 标签主要用来辅助搜索，后续我会增加一些相关功能。标签暂时没有特别作用。

## 什么是简单

本程序的灵感来源之一是 [Heynote](https://github.com/heyman/heynote),
但在我知道 heynote 之前就已经做过一个 [monostich](https://github.com/ahui2016/monostich) (也是类似的极简笔记程序).

heynote 已经很简单了，但对我来说还是不够简单。
如果你使用过 heynote 或本程序(STN), 你可能会有疑问：这与用记事本打开一个文本文件有什么区别？

这也是我使用 heynote 时的疑问。因此我需要比 heynote 更简单，就做了本程序（五柳速记）。
heynote 的问题是，在编写笔记时，会看见已有的内容，一旦看见，心态就不一样了。

本程序（五柳速记）的界面非常简单、简陋，这是经过深思熟虑的故意为之。
启动程序，只有一个文本框和一个按钮，没有任何别的东西，这样，感觉就会完全不一样。

这样做的好处是，直观感受是把资料扔进一个“麻袋”里，不需要整理。
完全只管记录即可，只管把东西扔进去。

甚至，如果记录后出现一个笔记列表，这都是不好的，会影响记录的心情。
记录后看不见结果，才是最舒服的。

另外，本程序不支持 Markdown, 这也是经过深思熟虑的决定。
我要极致的简单, md 多多少少还是会消耗一点点心智去关心格式，使用纯文本才是极致简单。

## 全部源码（约 100 行）

- 如果你已经下载本程序的源码，正常使用，那你就已经获得了本程序的全部代码，并且已具备修改代码的电脑环境。
- 本程序一共只有约 100 行代码，在 wuliu_stn 文件夹中，打开查看可以发现代码非常简单，非常直白。
- 有什么不满意的地方可以自行修改代码（扩展名为 `.java` 的文件）
- 本项目提供了一个脚本 `javac_all.ps1`, 修改源码后执行该脚本即可重新编译项目。  
  (Linux 或 Mac 请把脚本改名为 `javac_all.sh`, 不需要修改文件内容)  
  (文件内容也很简单，就一句话 `javac .\wuliu_stn\util\*.java .\wuliu_stn\create_note_gui\*.java`)
