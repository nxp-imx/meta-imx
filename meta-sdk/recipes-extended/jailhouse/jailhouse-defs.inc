JH_DATADIR ?= "${datadir}/jailhouse"
CELL_DIR ?= "${JH_DATADIR}/cells"
CELLCONF_DIR ?= "${JH_DATADIR}/configs"
INMATES_DIR ?= "${JH_DATADIR}/inmates"

# Set jailhouse architecture JH_ARCH variable
#
# return value must match one of architectures supported by jailhouse
#
valid_jh_archs = "x86 arm"

def map_jh_arch(a, d):
    import re

    valid_jh_archs = d.getVar('valid_jh_archs', True).split()

    if   re.match('(i.86|athlon|x86.64)$', a):  return 'x86'
    elif re.match('armeb$', a):                 return 'arm'
    elif re.match('aarch64$', a):               return 'arm64'
    elif re.match('aarch64_be$', a):            return 'arm64'
    elif a in valid_jh_archs:                   return a
    else:
        bb.error("cannot map '%s' to a jailhouse supported architecture" % a)

export JH_ARCH = "${@map_jh_arch(d.getVar('TARGET_ARCH', True), d)}"
