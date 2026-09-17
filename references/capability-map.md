# 能力映射

此映射来自对源项目目录结构与模块职责的只读盘点；仅记录可复用的技术主题，不复制其实现。

| 技术主题 | 观察到的模块族 | 可沉淀的复用点 |
| --- | --- | --- |
| Spring AI 基础 | `spring-ai`、`spring-ai-alibaba` | Chat、Prompt、Memory、结构化输出、多模型与韧性 |
| RAG 知识库 | `jc-rag-kb` | 多格式解析、切分、查询改写、重排、权限与来源 |
| MCP | `mcp-tools-client`、`mcp-tools-server` | 本地/远端 Server、工具、资源、提示词和客户端管理 |
| A2A | `a2a-client`、`a2a-server` | Agent Card、任务状态、流式协作、Webhook 与技能处理器 |
| 业务 Agent | `jc-sales-agent`、`jc-voice-shopping` | 场景工具、会话记忆、报表、异常分析与语音导购 |
| Java Agent 框架 | `langchain4j-ai`、`agent-scope-ai` | AI Service、工具编排与多 Agent 角色协作 |
| 质量保证 | `eval-framework` | 可测量的输出、检索与工具调用质量 |

推荐从一条端到端业务链路开始：先完成可审计的确定性服务，再接入模型和工具；不要一开始把所有框架混用。
