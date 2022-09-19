resource "google_compute_firewall" "o02-ni-gcp" {
  name = "devsecops-fw-single-port-egress"
  network = "devsecops-network-gcp"

  allow {
    protocol = "tcp"
    ports = [
      "21"]
  }

  direction = "EGRESS"
  priority = "2100"
  destination_ranges = [
    "0.0.0.0/0"]
}