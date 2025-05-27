SRC_URI:remove = "gitsm://github.com/KhronosGroup/Vulkan-Samples.git;branch=main;protocol=https;lfs=0"
SRC_URI += " \
    gitsm://github.com/KhronosGroup/Vulkan-Samples.git;branch=main;protocol=https;lfs=0;name=main \
    git://github.com/glfw/glfw.git;branch=master;protocol=https;name=glfw;destsuffix=git/third_party/glfw"
SRC_URI:remove = "file://32bit.patch"
FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"
SRC_URI += "file://Fix-gcc-13.patch"
SRCREV_FORMAT = "main_glfw"
SRCREV_main = "8b945bebf8b2fd987dcf0eeca048068adf4ea44d"
SRCREV_glfw = "8f470597d625ae28758c16b4293dd42d63e8a83a"
