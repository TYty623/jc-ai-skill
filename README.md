# Java AI Agent Engineering Skill

一个可直接复用的 Codex Skill：把 Java AI 项目中最有价值的工程边界沉淀为 RAG、MCP、业务工具和多 Agent 协作的实现方法。

## 包含内容

- `SKILL.md`：用于需求拆解、架构决策和安全检查的主指引。
- `references/`：能力边界与项目能力映射。
- `examples/java/`：零依赖、可编译的工具调用允许集示例。

## 安装

将整个目录放入 Codex 的 skills 目录（常见位置为 `~/.codex/skills/`），然后在任务中引用 `$jc-ai-skill`。

## 成果定位

该成果聚焦 Java/Spring Boot 的 AI 应用工程化：文档知识库、受控工具调用、MCP Client/Server、A2A 任务协作与业务 Agent。它是对原始项目的抽象总结，不是完整项目的镜像。

## 验证

```powershell
python <skill-creator>/scripts/quick_validate.py .
javac --release 17 -d .tmp examples\java\ToolInvocationPolicy.java
```

验证后可删除 `.tmp` 目录。
