LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=aeb40f7c58956a1eb8441f0b51f900bb"
DEPENDS = "virtual/opencl-icd"

SRC_URI = "git://github.com/CNugteren/CLBlast.git;protocol=https;branch=master"

SRCREV = "70016e869881df837402def4904b2888247e02d9"

S = "${WORKDIR}/git"

inherit cmake
