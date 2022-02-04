PACKAGECONFIG_REMOVE_IF_GPU:imxgpu:append = " glx"
PACKAGECONFIG_REMOVE_IF_GPU:imxgpu:remove = "glu"
PACKAGECONFIG_APPEND_IF_GPU:imxgpu:remove = "glut"
DEPENDS:append:imxgpu = " libglu"
