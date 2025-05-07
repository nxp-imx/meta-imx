SRCBRANCH = "lf-6.12.20_2.0.0"
SRCREV = "399d65450e9a377b4aaff4b0627619174e1c8c46" 

PV = "2023.03+git${SRCPV}"

ERROR_QA:remove = "buildpaths"
WARN_QA:append = " buildpaths"

INSANE_SKIP:${PN}:remove = "ldflags"
ERROR_QA:remove = "ldflags"
WARN_QA:append = " ldflags"
