FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "file://0001-Revert-driver-sysfs-Update-bin_attribute-version-che.patch"
SRC_URI:remove = "file://0001-YOCIMX-9281-1-Fix-gcc15-errors.patch \
                  file://0002-YOCIMX-9281-2-hypervisor-arm64-fix-strh-usage.patch"
SRCBRANCH = "lf-6.18.20_2.0.0"
SRCREV = "b2521d3762d846b0c84d327668e6f3e544bbfd3b" 

PV = "2023.03+git${SRCPV}"

PACKAGES += "${PN}-bash-completion"
FILES:${PN}-bash-completion = "${datadir}/bash-completion/completions/jailhouse"

ERROR_QA:remove = "buildpaths"
WARN_QA:append = " buildpaths"

INSANE_SKIP:${PN}:remove = "ldflags"
ERROR_QA:remove = "ldflags"
WARN_QA:append = " ldflags"
