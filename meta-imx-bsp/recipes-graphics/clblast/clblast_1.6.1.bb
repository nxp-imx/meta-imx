LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=aeb40f7c58956a1eb8441f0b51f900bb"
DEPENDS = "virtual/opencl-icd"

SRC_URI = "git://github.com/CNugteren/CLBlast.git;protocol=https;branch=master \
           file://0001-Disable-OpenCL-kernel-preprocessor-optimization.patch"

SRCREV = "e3ce21bb937f07b8282dccf4823e2acbdf286d17"

S = "${WORKDIR}/git"

inherit cmake
